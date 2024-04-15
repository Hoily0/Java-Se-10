package day4.com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Case12 {
    public static void main(String[] args) {
        //某公司开发部5名开发人员，要进行项目进展汇报，为了公平起见，采取随机排序进行依次汇报。
        // 请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。
        int[] jobNumber = new int[5];

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        for (int i = 0; i < jobNumber.length; i++) {

            jobNumber[i] = sc.nextInt();

        }




    }
}
