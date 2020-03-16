### 编程中的好习惯
* [消灭 Java 代码的“坏味道”](https://blog.csdn.net/diaojin6880/article/details/102197388)

### 不太熟悉的关键字
* strictfp 用于限制浮点计算的精度和舍入
* synchronized 同步
* transient 不用序列化
* volatile 表明两个或多个变量必须同步的发生变化

### Java进制
* 2进制/8进制/10进制/16进制
* 2进制：0b or 0B 开头
* 8进制：0 开头
* 16进制：0x or 0X 开头

### StringBuilder/StringBuffer/String
* String适用于少量的字符串操作，不要在for循环里面用String进行字符串拼接
* StringBuilder非线程安全，适合在单线程情况下使用（字符串拼接推荐用StringBuilder）
* StringBuffer是线程安全的，适合在多线程情况下使用

### java基本数据类型
- 整型
    - byte 1字节，8位， -128到127
    - short 2字节，16位
    - int 4字节，32位，20亿范围，默认的
    - long 8字节，64位
- 浮点型
    - float 4字节，单精度
    - double 8字节，双精度，默认的
- 字符
    - char 2字节
- 布尔型
    - boolean 1字节

### 隐式类型转换
- java支持不同类型的隐式转换，但只能从低转到高（从高到低需要显式转换，还可能丢失精度，故不推荐）
    - byte --> short --> int --> long --> float --> double
    - char --> int
### java反射（参考BookTest.java）
- 获取Class类对象的三种方式
    - Class<?> classObj = Class.forName("");
    - Class classObj = Book.class();
    - Book bookObj = new Book(); Class classObj = bookObj.getClass();
- 根据Class类对象获取指定类的一些方法和属性
- 待补充（todo）
