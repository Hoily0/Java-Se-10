package com.itheima;

import java.util.Arrays;

/**
 * 数组拷贝
 *
 *  请把一个整型数组，例如存了数据：11，22，33，拷贝成一个一模一样的新数组出来。
 */
public class Case05 {
    public static void main(String[] args) {
        int[] oldArr = {11, 22, 33, 44, 55, 66};

        int[] newArr= getCopyArray(oldArr);
        System.out.println("newArr = " + Arrays.toString(newArr));
        oldArr[3] = 99;
        System.out.println("oldArr = " + Arrays.toString(oldArr));

    }

    private static int[] getCopyArray(int[] oldArr) {

        int[] newArr = new int[oldArr.length];
        System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
//        for (int i = 0; i < oldArr.length; i++) {
//            newArr[i] = oldArr[i];
//        }
        return newArr;

    }


}
