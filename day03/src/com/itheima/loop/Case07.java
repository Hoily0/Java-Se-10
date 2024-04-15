package com.itheima.loop;

/**
 * do_while入门案例
 *
 * 练习:在控制台输出5次HelloWorld
 */
public class Case07 {
    public static void main(String[] args) {

        int count = 0;

        do {
            System.out.println("HelloWorld");
            System.out.println(count);
            count ++;
        }while (count<5);

    }
}
