package itheima.case03;

import java.util.Arrays;

/**
 * 操作字符串数据的方法
 *
 * 字符串常用方法
 */
public class Test1 {
    public static void main(String[] args) {
        //public int length()	获取字符串的长度返回（就是字符个数）
        String str = "     3214加拿大开发Sad    adNDaaWJ    ";
        System.out.println("str.length() = " + str.length());
        //public char charAt(int index)	获取某个索引位置处的字符返回
        System.out.println("str.charAt(5) = " + str.charAt(5));

        // String toLowerCase()  把字符串中的所有字符都转换为小写。
        System.out.println("str.toLowerCase() = " + str.toLowerCase());

        // String trim()         去除首尾空格
        System.out.println("str.trim() = " + str.trim());
        // int indexOf(String str)返回指定子字符串在此字符串中第一次出现处的索引。
        System.out.println("str.indexOf(14) = " + str.indexOf(14));

        // String toUpperCase()  把字符串中的所有字符都转换为大写。
        System.out.println("str.toUpperCase() = " + str.toUpperCase());

        //public char[] toCharArray()：	将当前字符串转换成字符数组返回
        System.out.println("str.toCharArray() = " + Arrays.toString(str.toCharArray()));

        //public byte[] getBytes();把字符串内容转换为字节数组返回
        System.out.println("str.getBytes() = " +  Arrays.toString(str.getBytes()));

    }
}
