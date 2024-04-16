package com.itheima;

/**
 * 方法的其他形式
 *
 * 如果方法不需要返回数据，返回值类型必须申明成void（无返回值申明）,  此时方法内部不可以使用return返回数据。
 * 方法如果不需要接收数据，则不需要定义形参，且调用方法时也不可以传数据给方法了。
 */
public class Case02 {

    public static void main(String[] args) {
//        print3();
    print33(100);
    }


    //练习:写一个方法，打印3个"Hello World" 无参数 无返回值
    public static void print3(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }


    public static void print33(int nums){
        for (int i = 0; i < nums; i++) {
            System.out.println("HelloWorld"+(i + 1));
        }
    }
    //练习:写一个方法，打印若干个"Hello World"，有参数 无返回值

}
