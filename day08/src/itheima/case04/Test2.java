package com.itheima.case04;

/**
 * 字符串不可变-String注意事项2
 *
 * String注意事项2:
 * 只要是以“...”方式写出的字符串对象，会存储到字符串常量池，且相同内容的字符串只存储一份；
 * 但通过new方式创建字符串对象，每new一次都会产生一个新的对象放在堆内存中。
 */
public class Test2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        char[] cs = new char[]{'a','b','c'};
        String s3 = new String(cs);
        String s4 = new String(cs);
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
