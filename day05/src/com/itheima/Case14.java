package com.itheima;

/**
 * return关键字
 *
 * 可以用在无返回值的方法中，作用是：立即跳出并结束当前方法的执行。
 */
public class Case14 {
    public static void main(String[] args) {

        returnTest();

    }

    private static String returnTest() {
        String str = "314";
        System.out.println("return之前");
        return str;
//        System.out.println("return之后");
    }
}
