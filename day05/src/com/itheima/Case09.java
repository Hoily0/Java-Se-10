package com.itheima;

/**
 * 数组求最大值改方法实现
 *
 * 需求：把找出数组的最大值案例，改造成方法，可以支持返回任意整型数组的最大值数据。
 */
public class Case09 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = getArrayMax(nums);
        System.out.println(max);
    }

    private static int getArrayMax(int[] array) {
        int max = 0;
        for (int i : array){
            max = i;
        }
        return max;
    }

}
