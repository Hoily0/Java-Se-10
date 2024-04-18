package com.itheima.case04;

/**
 * 案例2：阅读下面的两个程序，请写出程序打印的结果是多少
 * Java存在编译优化机制，程序在编译时： “a” + “b” + “c” 会直接转成 “abc”，以提高程序的执行性能
 */
public class Test4 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2+ "c";
        System.out.println(s1 == s3);

        /*String s1 = "abc";
        String s2 = "a"+"b"+"c";
        System.out.println(s1 == s2);*/

    }
}
