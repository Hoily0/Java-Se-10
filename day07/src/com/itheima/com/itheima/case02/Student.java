package com.itheima.com.itheima.case02;

public class Student{

    String name;
    double chinese;
    double math;

    public void printTotalScore(){
        System.out.print(name + "的总成绩为" + (chinese + math));
    }

    public void printAvgScore(){
        System.out.println(name + "的各科平均成绩为" + (chinese + math)/2);
    }

}