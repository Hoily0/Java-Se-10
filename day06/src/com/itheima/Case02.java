package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * 验证码
 *
 * 开发一个程序,可以生成指定位数的验证码,每位可以是数字、大小写字母。
 */
public class Case02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String result = Verify(sc.nextInt());
        System.out.println(result);

    }

    private static String Verify(int num) {

        StringBuilder sb = new StringBuilder();
        Random rd = new Random();
        String data = "qwertyuiopaasadafghjklzxcvbnm1234567890QWERTYUIOPSDAFGHJKLZXCVBNM";

        for (int i = 0; i < num; i++) {

            int index = rd.nextInt(data.length());
            sb.append(data.charAt(index));

        }
        return sb.toString();
    }

}
