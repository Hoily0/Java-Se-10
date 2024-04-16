package com.itheima;

/**
 * 引用类型的参数传递
 */
public class Case07 {

    public static void main(String[] args) {
        int[] arrs = new int[]{10, 20, 30};
        change(arrs);
        System.out.println("main：" + arrs[1]);
    }

    public static void change(int[] arrs) {
        System.out.println("方法内1：" + arrs[1]);
        arrs[1] = 222;
        System.out.println("方法内2：" + arrs[1]);
    }
}
