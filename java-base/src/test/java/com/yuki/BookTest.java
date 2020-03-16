package com.yuki;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class BookTest {
    /**
     * 获取Class类对象的三种方式
     *
     */
    @Test
    public void getClz() throws Exception {
        // 方法一，使用 Class.forName 静态方法
        Class<?> classBook = Class.forName("com.yuki.Book");

        // 方法二：直接通过 类名.class 的方式得到
        Class clz = Book.class;

        // 方法三：使用类对象的 getClass() 方法。
        Book book1 = new Book();
        Class<? extends Book> book1Class = book1.getClass();

        Assert.assertTrue(classBook == clz);
        Assert.assertTrue(classBook == book1Class);
    }

    /**
     * 创建对象
     *
     */
    @Test
    public void reflectNewInstance() throws Exception {
        Class<?> classBook = Class.forName("com.yuki.Book");
        Object objectBook = classBook.newInstance();
        Book book = (Book) objectBook;
        book.setName("name");
        book.setAuthor("author");
        Assert.assertEquals("name", book.getName());
        Assert.assertEquals("author", book.getAuthor());
    }

    /**
     * 反射私有的构造方法
     *
     * @throws Exception
     */
    @Test
    public void reflectPrivateConstructor() throws Exception {
        Class<?> classBook = Book.class;
        Constructor<?> declaredConstructorBook = classBook.getDeclaredConstructor(String.class, String.class);
        // 暴力反射
        declaredConstructorBook.setAccessible(true);
        Object objectBook = declaredConstructorBook.newInstance("name", "author");
        Book book = (Book) objectBook;
        Assert.assertEquals("name", book.getName());
        Assert.assertEquals("author", book.getAuthor());
    }
}