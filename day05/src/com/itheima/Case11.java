package com.itheima;

import java.util.Scanner;

/**
 * 从数组中查询指定元素的索引
 *
 * 需求：设计一个方法可以接收整型数组，和要查询的元素值；最终要返回元素在该数组中的索引，如果数组中不存在该元素则返回 -1。
 * 例如： [11, 22, 33, 44, 55]
 * 输入元素：44。返回索引3
 * 输入元素：88。返回-1
 */
public class Case11 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 10, 199, 3};
        int num = sc.nextInt();

        int result = findArrayIndex(array, num);
        System.out.println(result);

    }

    private static int findArrayIndex(int[] array, int value) {
        int index = 0;
        boolean found = false;
        for (int element : array) {
            if (element == value) {
                found = true;
                break;
            }
            index++;
        }

        if (found) {
            System.out.println("检测到了");
            return index;
        } else {
            return -1;
        }


    }


}
