package work;

import empty.Student;

import java.util.Scanner;

public class Day1 {
    public static void head1(){
        System.out.println("java是一门跨平台的计算机语言");
        System.out.println("被称为一次编写，处处运行");
    }

    public static  void head2(){
        Student student1 = new Student();
        student1.setName("张三");
        student1.setSex("男");
        student1.setAge(18);
        student1.setHeight(1.78);
        student1.setMarriage(false);

        System.out.println("姓名："+student1.getName());
        System.out.println("性别："+student1.getSex());
        System.out.println("年龄："+student1.getAge());
        System.out.println("身高："+student1.getHeight());
        System.out.println("婚否："+student1.isMarriage());

    }

    public static void head4(){
        int learner = 100;
        double price = 55.55;
        boolean words = false;
        System.out.println(learner);
        System.out.println(price);
        System.out.println(words);
    }

    public static void head6(){
        int m = 0; int n = 0;

        Scanner sc= new Scanner(System.in);
        m = sc.nextInt();
        n=  sc.nextInt();
        System.out.println(m+"+"+n+"="+(m+n));
    }

    public static void head7(){
        String name = "张三";
        String sex = "男";
        int age = 18;
        String address = "XX省XX市";
        double overage = 55.55;

        System.out.println("我的姓名是"+name);
        System.out.println("我的性别是"+sex);
        System.out.println("我的年龄是"+age);
        System.out.println("我的地址是"+address);
        System.out.println("我的饭卡余额是"+overage+"元");

    }





    public static void head8() {
        int input;
        int[] normal = {1, 2};
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("如需求一请输入“1”，需求二请输入“2”");
            input = sc.nextInt();
            boolean isValidInput = false;
            for (int j : normal) {
                if (input == j) {
                    isValidInput = true;
                    break;
                }
            }

            if (!isValidInput) {
                System.out.println("请输入合法的请求");
                continue;
            }

            switch (input) {
                case 1:
                    double remain = 188.8;
                    System.out.print((long)remain + "-->");
                    System.out.print("发100元：" + (int)remain + "-" + 100 + "=" +(int)(remain - 100));
                    remain -= 100;
                    System.out.print("-->");
                    System.out.print("收20元：" + (int)remain + "-" + 20 + "=" +(long) (remain - 20));
                    break;

                case 2:
                    int adultPrice = 2;
                    int childPrice = 1;
                    int adultTimeOne = 3;
                    int childTimeOne = 1;
                    int adultTimeTwo = 1;
                    int childTimeTwo = 1;
                    int oneTimePrice = adultTimeOne * adultPrice + childTimeOne * childPrice;
                    int twoTimePrice = adultTimeTwo * adultPrice + childTimeTwo * childPrice;
                    System.out.println(oneTimePrice + twoTimePrice);
                    break;
            }
            break;
        }
    }

    public static void flower() {
        int count = 0;
        for (long i = 99; i < 999; i++) {
            if(Math.pow((i%10), 3)+Math.pow((i/10)%10, 3)+Math.pow((i/100)%10, 3) == i){
                System.out.println(i);
                count ++;
            }
        }
        System.out.println(count);

    }







}
