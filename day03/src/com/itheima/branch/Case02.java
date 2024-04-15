package com.itheima.branch;

import java.util.Scanner;

/**
 * 考试奖励案例
 *
 * System.out.println("奖励自行车一辆");
 * System.out.println("奖励变形金刚玩具一个");
 * System.out.println("老王很生气直接揍小王一顿");
 */
public class Case02 {
    public static void main(String[] args) {
        //需求：键盘录入考试成绩，根据成绩所在的区间，程序打印出不同的奖励机制
        //1.接收小王的考试成绩
        System.out.println("请输入您的考试成绩：");
        Scanner sc = new Scanner(System.in);
        int score  = sc.nextInt();
        //2.使用if else if else语法
        if(score >= 90 && score <= 100){
            System.out.println("奖励自行车一辆");
        }else if(score >= 80 && score <= 89){
            System.out.println("奖励变形金刚玩具一个");
        }else if(score >= 0 && score <= 79){
            System.out.println("老王很生气直接揍小王一顿");
        }else{
            System.out.println("数据非法");
        }

        //注意事项：正确数据、边界数据、错误数据
    }
}
