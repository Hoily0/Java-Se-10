package day3.work;

import java.sql.Time;
import java.util.Scanner;

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


}
