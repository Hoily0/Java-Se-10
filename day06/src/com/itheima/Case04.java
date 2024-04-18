package com.itheima;

import java.util.Scanner;

/**
 * 数字加密
 *
 * 某系统的数字密码是一个四位数，如1983，为了安全，需要加密后再传输，加密规则是：对密码中的每位数，都加5,再对10求余，
 * 最后将所有数字顺序反转，得到一串加密后的新数，请设计出满足本需求的加密程序！
 */
public class Case04 {

    public static void main(String[] args) {
//        int i = 2;
//        int num = 1983;
//        System.out.println(num % Math.pow(10,i));

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入。。。。");
        int result = encryption(sc.nextInt());
        System.out.println(result);

    }

    private static int encryption(int num) {
        int sum = 0;
        int length = 0;
        for (int i = 1; i < num; i *= 10) {
            length ++;
//            System.out.println(length);
        }
        for (int i = 0; i < length; i++) {
//            int value = (int) ((((num % Math.pow(10,i)) + 5) % Math.pow(10, i)) * Math.pow((0.1),i));
//            int value = (int) ((((num % Math.pow(10,i)) + 5) % 10) * Math.pow((0.1),i));
//            int value = (int) ((((num % (int) Math.pow(10, i)) + 5) % 10) * Math.pow(10, i - 1));

            int digit = (num / (int) Math.pow(10, i)) % 10; // 获取数字的第i位数字
            digit = (digit + 5) % 10; // 对第i位数字加5并对10取余
            sum = sum * 10 + digit;


//                int digit = (num / (int) Math.pow(10, i)) % 10; // 获取数字的第i位数字
//                int value = (digit + 5) % 10; // 对第i位数字加5并对10取余
//                sum += value * (int) Math.pow(10, i); // 将处理后的数字加到sum中


//            sum += value;
        }

        return sum;
    }

}
