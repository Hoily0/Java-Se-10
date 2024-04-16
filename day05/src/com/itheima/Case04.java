package com.itheima;

/**
 * 方法的案例
 *
 *  需求：求 1-n的和。
 *  方法是否需要接收数据进行处理？ 需要接收n具体的值，因此形参声明为：int n.
 *  方法是否需要返回数据？       需要返回1-n的求和结果，因此返回值类型声明为int.
 *  方法内部的业务：完成求1-n的和并返回。
 *
 *  需求：判断一个整数是奇数还是偶数，并把判断的结果输出出来。
 *  方法是否需要接收数据进行处理？需要接收一个整数来判断，因此形参声明为：int number.
 *  方法是否需要返回数据？      方法内部判断完后直接输出结果即可，无需返回，因此返回值类型声明为：void
 *  方法内部的业务：通过if语句判断number是奇数还是偶数，并输出结果。
 */
public class Case04 {
    public static void main(String[] args) {
        int sum = getSum(40);
        System.out.println(sum);

        boolean result = isEven(30);
        System.out.println(result);
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static boolean isEven(int num){
        return num % 2 == 0;

    }


}
