package com.itheima;

import java.util.Scanner;

/**
 * 打印int类型的数组内容
 *
 * 需求： 定义一个方法,输出一个int类型的数组内容，要求输出格式为：[11, 22, 33, 44, 55]。
 *  方法是否需要接收数据进行处理？
 *  方法是否需要返回数据？
 *  方法内部的业务：遍历数组，并输出相应的内容。
 */
public class Case08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        getArray(sc.nextInt());
    }

    private static void getArray(int end) {
        System.out.print("[");
        for (int i = 0; i <= end; i++) {
            System.out.print(i * 11);
            if (i < end){
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }


}
