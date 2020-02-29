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
