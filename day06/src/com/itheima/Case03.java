package com.itheima;

import java.util.Scanner;

/**
 * 评委打分
 *
 * 在唱歌比赛中,可能有多名评委要给选手打分,分数是[0-100]之间的整数。
 * 选手最后得分为：去掉最高分、最低分后剩余分数的平均分，
 * 请编写程序能够录入多名评委的分数，并算出选手的最终得分。
 */
public class Case03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入人数");
        int num = scanner.nextInt();
        
        double endScore = hitScore(num);
        System.out.println(endScore);

    }

    private static double hitScore(int quantity) {

        Scanner sc = new Scanner(System.in);

        int scores[] = new int[quantity];
        int score= 0;


        for (int i = 0; i < quantity; i++) {
            System.out.println("第"+(i+1)+"位输入分数");
          score = sc.nextInt();
            if (score > 100 || score < 0){
                System.out.println("分数不规范");
            }else {
                scores[i] = score;

            }
        }

        int min = 0;
        int max = 0;
        int and = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min){
                min = scores[i];
            }
            if (scores[i] > max){
                max = scores[i];
            }

            and += scores[i];
        }

    return (double) (and - max - min) / (quantity -2);
    }

}
