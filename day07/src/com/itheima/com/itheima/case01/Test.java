package com.itheima.com.itheima.case01;

/**
 * 面向对象编程快速入门
 *
 *      对象是怎么创建出来的？
 *          对象是根据类创建出来的,类也称为对象的设计图（或者对象的模板）。
 *              类中的变量,其实就是在设计这张表中有哪些数据
 *              类中的方法,就是用来对数据进行处理的方式
 *
 * 需求：根据学生的姓名 语文 数学，计算 打印总分数、打印平均分数
 */
public class Test {
    /**
     *   面向对象编程
     *   第二步：创建对象 为对象赋值，再通过对象打印总成绩和平均成绩
     * @param args
     */
    public static void main(String[] args) {
        //1.创建一个波妞对象
        Student s1  = new Student();
        s1.name ="波妞";
        s1.chinese = 100;
        s1.math = 100;
        s1.printTotalScore();
        s1.printAvgScore();


        Student s2  = new Student();
        s2.name ="波仔";
        s2.chinese = 59;
        s2.math = 100;
        s2.printTotalScore();
        s2.printAvgScore();

    }
}
