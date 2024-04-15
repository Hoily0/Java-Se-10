package itheima;

import java.util.Scanner;

public class Case06 {
    public static void main(String[] args) {
        //需求:某歌唱比赛，需要开发一个系统：可以录入6名评委的打分，录入完毕后立即输出平均分做为选手得分。
//        Scanner sc= new Scanner(System.in);
//
//        int sum = 0;
//        for (int j = 0; j < 6; j++) {
//
//            sum += sc.nextDouble();
//        }
//        System.out.println(sum * 1.0 / 6 );


        Scanner sc= new Scanner(System.in);

        double[] fraction = new double[6];
        double sum = 0;

        for (int i = 0; i < fraction.length; i++) {

            fraction[i] = sc.nextDouble();
//            System.out.println(fraction[i]);
            sum += fraction[i];
        }
        System.out.println(sum * 1.0 / 6 );

    }
}
