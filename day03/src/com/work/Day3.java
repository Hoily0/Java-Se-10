package com.work;

import java.sql.Array;
import java.sql.Time;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Day3 {

    public static void head1(){

        Scanner sc= new Scanner(System.in);

        System.out.println("请输入第一个数：");
        double number1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        double number2 = sc.nextInt();

        System.out.println("请输入您要进行的运算（1：表示加法，2：表示减法，3：表示乘法，4：表示除法)");
        int choice = sc.nextInt();

        char addition  = '+';
        char subtraction = 45;
        char multiplication = 215;
        char division = 247;
        char equal = 61;


        switch (choice){
            case 1:
                System.out.println(number1+""+addition +number2+equal+(number1+number2));
                break;
            case 2:
                System.out.println(number1+""+subtraction +number2+equal+(number1-number2));
                break;
            case 3:
                System.out.println(number1+""+multiplication +number2+equal+(number1*number2));
                break;
            case 4:
                System.out.println(number1+""+division +number2+equal+(number1/number2));

        }

    }


    public static void head2(){
        int phonePrice = 7988;
        String deal = (phonePrice - phonePrice*0.8) > 1500 ? "省钱" : "不省钱";
        System.out.println(deal);
    }


    public static void head3(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("数字一");
        int numberOne = scanner.nextInt();
        System.out.println("数字二");
        int numberTwo = scanner.nextInt();
        System.out.println("数字三");
        int numberThere = scanner.nextInt();

        int result = (numberOne > numberTwo ? numberOne : numberTwo) > numberThere ?
                (numberOne > numberTwo ? numberOne : numberTwo) : numberThere;

        System.out.println(result);
    }

    public static void head4(){

        Scanner scanner = new Scanner(System.in);
        double lump ;

        System.out.println("请输入存款金额");
        double principal = scanner.nextDouble();

        if (principal < 1000){
            System.out.println("本金1000起步");
            principal = scanner.nextDouble();
        }

        System.out.println("选择存款时间");
        int TimeYear = scanner.nextInt();

        if (TimeYear == 1){
            lump = principal * TimeYear *2.25/1000  + principal;
            System.out.println(lump);
        }
        if (TimeYear == 2){
            lump = principal * TimeYear *2.7/1000  + principal;
            System.out.println(lump);
        }
        if (  TimeYear >= 3 && TimeYear < 5){
            lump = principal * TimeYear *3.25/1000  + principal;
            System.out.println(lump);
        }
        if (TimeYear >= 5){
            lump = principal * TimeYear *3.6/1000  + principal;
            System.out.println(lump);
        }



    }

    public static void head5(){

        Scanner sc= new Scanner(System.in);

        System.out.println("请输入顾客类型：0表示普通顾客，1表示会员");
        int customerType =sc.nextInt();//顾客类型:0普通，1会员
        double endLump = 0;

        System.out.println("请输入总金额");
        int lump = sc.nextInt();

        switch (customerType){
            case 0:

                if (lump >= 100){
                    endLump =(int)(lump * 0.9);
                    System.out.println("普通顾客已打折"+endLump);
                }else if (lump < 100 && lump >= 0){
                    System.out.println("普通顾客未打折"+endLump);
                }
                break;
            case 1:
                if (lump < 200){
                    endLump = (lump * 0.8);
                    System.out.println("会员八折价"+endLump);
                }else if(lump >200){
                    endLump = (lump *0.75);
                    System.out.println("会员7.5折价"+endLump);
                }
        }

    }


    public static void head6(){

        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();

        if (income >= 5000){

            int tax = 0;
            int seria = 0;
            int netIncome = income - 5000 - income / 10;
            System.out.println("去除三险一金后剩余"+(netIncome+5000));

            if (netIncome <= 3000){
                seria ++;
            } else if (netIncome > 3000 && netIncome <= 12000) {
                seria = seria + 2;
            } else if (netIncome > 12000 && netIncome <= 25000){
                seria = seria + 3;
            } else if (netIncome > 25000 && netIncome <= 35000) {
                seria = seria + 4;
            } else if (netIncome > 35000 && netIncome <= 55000) {
                seria = seria + 5;
            }else if (netIncome > 55000 && netIncome <= 80000){
                seria = seria + 6;
            } else if (netIncome > 80000) {
                seria = seria + 7;
            }


            int tax1 = 0;
            int tax2 = 0;
            int tax3 = 0;
            int tax4 = 0;
            int tax5 = 0;
            int tax6 = 0;
            int tax7 = 0;

            switch (seria){
                case 7:
                     tax7 = (netIncome - 80000) / 100 * 45;
                    System.out.println("45%税部分："+tax7);
                case 6:
                    tax6 = (netIncome - 55000) / 100 * 35 ;
                    System.out.println("35%税部分："+tax6);
                case 5:
                     tax5 = (netIncome - 35000) / 100 * 30 ;
                    System.out.println("30%税部分："+tax5);
                case 4:
                     tax4 = (netIncome - 25000) / 100 * 25 ;
                    System.out.println("25%税部分："+tax4);
                case 3:
                     tax3 = (netIncome - 12000) / 100 * 20 ;
                    System.out.println("20%税部分："+tax3);
                case 2:
                     tax2 = (netIncome -3000) / 100 * 10 ;
                    System.out.println("10%税部分："+tax2);
                case 1:
                     tax1 = 3000 / 100 * 3 ;
                    System.out.println("3%税部分："+tax1);

            }
            tax = tax1 + tax2 + tax3 + tax4 + tax5 + tax6 + tax7;
            System.out.println(tax);
        }

    }



    public static void head7() {

      int[] years = IntStream.rangeClosed(1949, 2019).toArray();

      for (int year : years) {
          if ((2019 - year) % 12 == 0){
              System.out.println(year);
          }
      }

//        for (int year = 2019; year > 1949; year -= 12){
//            System.out.println(year);
//
//        }
    }


    public static void head8() {
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print("@");
            }
        }

    }


    public static void head9() {
        for (int i = 0; i <= 5; i++) {
            System.out.println();
            for (int i1 = 0; i1 < i; i1++) {
                System.out.print("@");

            }

        }
    }

    public static void head10() {
//        for (int i = 1; i <= 9; i++) {
//            System.out.println();
//            for (int i1 = 1; i1 <= i; i1++) {
//                System.out.print(i + " * " + i1 + " = " + (i * i1));
//                System.out.print("    ");
//            }
//
//        }

        for (int i = 0; i <= 9; i++) {
            System.out.println();
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i + "*" + i1 + "=" + (i * i1));
                System.out.print("  ");

            }

        }
    }

    public static void head11() {
        int sum = 10;
        for (int i = 0; i < sum / 1; i++) {

            System.out.println("1元：" + "5毛");
            System.out.println(i+"   "+(sum -i) * 2);

        }
    }


    public static void head12() {
        int count = 0;
        for (int year = 1988; year < 2019; year++) {
            if ((year % 4 == 0 ) && (year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year);
                count ++;
            }

        }
        System.out.println(count);
    }


    public static void head13() {

        int fullBucket = 10;
        int runningWater = 3;
        int time = 0;

        while (fullBucket  >=   (time * 1) * time -  runningWater * time) {

            time ++;
        }
        System.out.println(time);
    }
}

