package com.itheima.case04;

/**
 * 字符串不可变-String注意事项1
 *
 * String注意事项1: String的内容是不可变的,String对象被称为不可变字符串对象
 * 结论：
 * 每次试图改变字符串对象实际上是新产生了新的字符串对象了，变量每次都是指向了新的字符串对象，
 * 之前字符串对象的内容确实是没有改变的，因此说String的对象是不可变的
 */
public class Test1 {
    public static void main(String[] args) {
        String name = "黑马";
        name += "程序员";
        name += "播妞";
        System.out.println(name);
    }
}
