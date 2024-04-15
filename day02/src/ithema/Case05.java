package ithema;


/**
 * 强制类型转换
 *
 * 类型范围大的数据或者变量，直接赋值给类型范围小的变量，会报错。
 *      强行将类型范围大的变量、数据赋值给类型范围小的变量。
 *      目标数据类型 变量名 = (目标数据类型)被转换的数据|变量名
 */
public class Case05 {
    public static void main(String[] args) {

        //将int类型的a变量值(20 1500) 直接赋值 给byte类型的变量b
//        int a =1499;
        for (int a = 100; a < 300; a++) {
            byte b =(byte) a;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("结果"+1500%256);
        }
//        int a = 127;





        //浮点型强转成整型，直接丢掉小数部分，保留整数部分发挥
        double db = 76.36898;
        long lg = (long)db;
        System.out.println("lg = " + lg);

    }
}
