package com.itheima;

/**
 * 方法重载的应用场景
 *
 * 开发武器系统，功能需求如下：
 *     可以默认发一枚武器。
 *     可以指定地区发射一枚武器。
 *     可以指定地区发射多枚武器。
 */
public class Case13 {
    public static void main(String[] args) {

    }

    public static void fire(){              //空参方法
        System.out.println("空参");
    }


    public static void fire(String area){
        System.out.println("包含一个参数的有参方法");
    }

    public static void fire(String area, int number){
        System.out.println("包含两个参数的有参方法");
    }

}
