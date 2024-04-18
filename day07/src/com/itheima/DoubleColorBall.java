package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class DoubleColorBall {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[7];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

         int result = hit(nums);

    }

    private static int hit(int[] nums) {
        Random random = new Random();

        int[] shotNums = new int[7];

        for (int i = 0; i < shotNums.length; i++) {
            if (i < 6){
                shotNums[i] = random.nextInt(33) + 1;
            }else {
                shotNums[i] = random.nextInt(16) + 1;
            }
        }

    }


}
