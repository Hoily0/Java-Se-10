package com.itheima;

import java.awt.*;
import java.util.Scanner;

/**
 * 找素数
 *
 * 题目:判断101-200之间有多少个素数,并输出所有素数
 * 说明：除了1和它本身以外，不能被其他正整数整除，就叫素数。
 * 比如：3、7就是素数，而9、21等等不是素数。
 */
public class Case08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = 0; int end = 0;

        System.out.println("输入起始值");
             start = sc.nextInt();

        System.out.println("输入末尾值");
             end = sc.nextInt();

        int[] inputNums = {start, end};
        int result = primeNumber(inputNums);

        System.out.println(start + "和" + end + "之间的素数个数有" + result + "个");
    }


    private static int primeNumber(int[] inputNums) {
        int count = 0;
        for (int i = inputNums[0]; i <= inputNums[1]; i++) {
            boolean isPrime = true; // 假设i是素数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1) {
                System.out.println("素数：" + i);
                count++;
            }
        }

        return count;
    }


}
