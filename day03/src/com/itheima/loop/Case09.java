package com.itheima.loop;

/**
 * 循环嵌套
 *
 * 一个循环中又包含另一个循环(套娃)
 *
 * 需求：在控制台使用 * 打印出4行5列的矩形
 */
public class Case09 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int i1 = 0; i1 < 5; i1++) {
                System.out.print('*');
            }
        }

    }
}
