package com.itheima.com.itheima.case07;


import java.util.List;

public class StuOper {

    Student student;
    public void selectAge(Student student){
        if (student.getAge() >= 18){

            System.out.println("成年了");
        }else {
            System.out.println("未成年");
        }
    }

//    public  Student[] findInfo( student){
//
//    }


//    public Student findOther(Student name){
//
//        if (student.getName().equals()){
//            return student;
//        }
//        return null;
//    }
//




}
