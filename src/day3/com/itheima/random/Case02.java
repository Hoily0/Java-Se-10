package day3.com.itheima.random;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 */
public class Case02 {
    public static void main(String[] args) {
        //需求： 随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中结束游戏。
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();


        int key = rd.nextInt(100) + 1;

        System.out.println("请输入数据");
        int num = sc.nextInt();

        while (num != key){
            if (num > key){
                System.out.println("猜大了");
                num = sc.nextInt();
            }else {
                System.out.println("猜小了");
                num = sc.nextInt();
            }
        }

            System.out.println("猜对了，答案是" +key+ "游戏终止");








    }
}
