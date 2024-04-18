package com.itheima;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 双色球
 *
 * 模拟双色球-用户投注一组号码
 * 模拟双色球-随机生成一组中奖号码
 * 模拟双色球-判断中奖情况
 * <p>
 * 注意：6个红球号码的范围是1-33之间，且不能重复；1个蓝球号码的范围在：1-16之间。
 */
public class Case09 {

    public static void main(String[] args) {

        int[] userNumbers = userSelectNumbers();
//        int[] luckNumbers = createLuckNumbers();

//        judge(userNumbers, luckNumbers);
    }




    private static int[] userSelectNumbers() {
        int[] userNumber = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            if (i < 6){
                System.out.println("请输入第"+ (i + 1) + "个数字");
                if (i == 0){
                    userNumber[i] = sc.nextInt();
                } else if (i > 0) {
                    for (int j = 0; j < userNumber.length; j++) {
                        if (userNumber[j] == sc.nextInt()){
                            System.out.println("输入重复，重新输入");
                            userNumber[j] = sc.nextInt();
                        }
                    }

                }
            }

        }
        System.out.println(Arrays.toString(userNumber));
        return userNumber;
    }


//    private static int[] createLuckNumbers() {
//        return [];
//    }

    private static void judge(int[] userNumbers, int[] luckNumbers) {

    }




}
