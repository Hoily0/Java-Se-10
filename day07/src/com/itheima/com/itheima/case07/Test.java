package com.itheima.com.itheima.case07;


/**
 * 实体类
 *
 * 实体类只负责数据存取
 *      这个类中的成员变量都要私有，并且要对外提供相应的getXxx ，setXxx方法
 *      类中必须要有一个公共的无参的构造器。
 */
public class Test {
    public static void main(String[] args) {

        Student st =  new Student();

        st.setAge(16);
        st.setName("王大伟");
        st.setSex("女");

        System.out.println(st.getName());
        System.out.println(st.getSex());
        System.out.println(st.getAge());


        Student st1 = new Student("林而非",19,"男");
        System.out.println(st1);

        StuOper stuOper = new StuOper();
        stuOper.selectAge(st1);
        stuOper.selectAge(st);

//        stuOper.findOther("林而非");


    }
}
