package com.itheima.com.itheima.case01;

/**
 * 面向对象编程
 * 第一步：创建类
 */
public class Student {
    String name;//不用赋值（new创建对象的时候赋值）
    double chinese;
    double math;

    //打印总成绩(面向对象编程中static不用加)
    public void printTotalScore(){
        System.out.print(name+"ta的总成绩为"+(chinese+math));
    }

    //打印平均成绩
    public void printAvgScore(){
        System.out.print(name+"ta的平均成绩为"+(chinese+math)/2);
    }


}
