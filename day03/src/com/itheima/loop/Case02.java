package com.itheima.loop;

/**
 * for求和案例
 */
public class Case02 {
    public static void main(String[] args) {
        //需求：求1-5之间的数据和，并把求和结果在控制台输出。
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            sum = sum + i ;
        }
        System.out.println(sum);
    }
}
