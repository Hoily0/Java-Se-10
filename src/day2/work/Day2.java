package day2.work;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Day2 {
    public static void head1(){
        int number;
        StringBuilder octal = new StringBuilder();//八进制
        int decimal;//十进制
        int binary;//二进制
        int hexadecimal;//十六进制


        for (number = 98; number > 8;number =  number/8) {
            octal.append((number/8)%8);
//            System.out.println(number/8);
            System.out.println((number/8)%8);
            System.out.println("octal = " + octal);


//            int decimalNumber = 98;
//            String octalNumber = Integer.toOctalString(decimalNumber);
//            System.out.println(octalNumber); // 输出：142


        }


    }


    public static void head2(){
        byte bt = 127;
        System.out.println("bt = " + bt);

        short st= 32767;
        System.out.println("st = " + st);

        int it = 341243124;
        System.out.println("it = " + it);

        char cr = 'F';
        String str = "的沙发和就开始";

        System.out.println("str = " + str);
        long lg = 924024345354234534L;
        System.out.println("lg = " + lg);
        System.out.println("cr = " + cr);

        float ft = 252352354433.4F;
        System.out.println("ft = " + ft);

        double db = 094371847120347302174024D;
        System.out.println("db = " + db);

    }


    public static void head3(){
        System.out.println("自动类型转换：");
        byte bt = 78;
        int te = bt;
        System.out.println("int类型："+te);
        int a = 666;

        long lg= 3543L;
        int it =(int)lg;
        System.out.println("int类型："+lg);


        String res = a + "黑马程序员";
        System.out.println(res);
        System.out.println("res = " + res);
        System.out.println("a = " + a);

        // 案例2:
        System.out.println(666 + "黑马程序员");//拼接
        System.out.println(66 + 6 + "黑马程序员");//计算拼接
        System.out.println(66 + "黑马程序员" + 6);//拼接
    }


    public static void head5(){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();         //输入的数值
//        long num = 12345;
        int valve = 0;              //数位值
        int count = 1;                  //计数器

        while (num/count >= 1){
            valve++;
            count= count *10;
        }

        System.out.println("共有"+valve+"位数");

        for (int i = 0; i < valve; i++) {
            System.out.println("第"+(valve-i)+"位是："+num/((int)Math.pow(10,i))%10);
        }

    }


    public static void head7(){
        Scanner sc= new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("已选择及格判断");
                int scope = sc.nextInt();
                String goal = scope > 60 ? "合格": "不合格";
                System.out.println("goal = " + goal);

            case 2:
                System.out.println("已选择双数判断");
                System.out.println("数字一");
                int m = sc.nextInt();
                System.out.println("数字二");
                int n = sc.nextInt();
                System.out.println(Math.max(m, n));

            case 3:
                System.out.println("已选择三数判断");
                System.out.println("数字一");
                int a = sc.nextInt();
                System.out.println("数字二");
                int b = sc.nextInt();
                System.out.println("数字三");
                int c = sc.nextInt();
                int number = (a > b ? a : b) > c ?  (a > b ? a : b) : c;
                System.out.println("maxNumber = " + number);

        }
    }


    public static void head8(){
        Scanner scanner = new Scanner(System.in);

        int age =scanner.nextInt();
        String name = scanner.next();

        System.out.println("age = " + age);
        System.out.println("name = " + name);
    }


    public static void head9(){

        double fatherHigh = 177;
        double motherHigh = 165;

        System.out.println("sonHigh = " + (fatherHigh + motherHigh) * 1.08 / 2);
        System.out.println("daughterHigh = " + (fatherHigh * 0.923 + motherHigh) / 2);

    }


    public static void head10(){

        int reaTeaStart = 21;
        int greenTeaStart = 24;

        if((reaTeaStart * 2 +3) == (greenTeaStart * 2)){
            System.out.println("对");
        }else {
            System.out.println("错");
        }

    }


    public static void head11() {

        double ffsp = 24;  //鱼香肉丝
        double fp = 8;
        double rice = 3;
        double ffspDf = 16;  //鱼香肉丝打折

        double order1 = 0.8 *(ffsp +fp +rice);//优惠
        double order2 = ffspDf+rice+fp;//单点
        String result  = order1 > order2 ? "优惠" : "单点";
        System.out.println(result);
        System.out.println(order1 > order2 ? order1 : order2);
    }
}
