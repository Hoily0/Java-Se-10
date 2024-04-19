package com.itheima.com.itheima.case02;

/**
 * 多个对象在计算机中的执行原理
 */

public class Test {
    public static void main(String[] args) {

        Student st1 = new Student();

        st1.name = "王富贵";
        st1.chinese = 100;
        st1.math = 100;

        st1.printTotalScore();
        System.out.print("    ");
        st1.printAvgScore();


        Student st2 = new Student();

        st2.name = "林吟鹿";
        st2.chinese = 90;
        st2.math = 79;

        st2.printTotalScore();
        System.out.print("    ");
        st2.printAvgScore();
    }
}

