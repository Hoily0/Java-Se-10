package ithema;

/**
 * 自动类型转换
 * 类型范围小的变量，可以直接赋值给类型范围大的变量。
 */
public class Case03 {
    public static void main(String[] args) {
        //将byte类型的数据 直接 赋值给 int类型的变量
        byte bt;
        bt= 1;
        int it = bt;
        System.out.println(it);

        //将int类型的数据 直接 赋值给 double类型
        int it2;
        it2 = 1;
        double db = it2;
        System.out.println(db);
        //将char类型的数据（'a'） 直接 赋值给 int类型
        char cr = 'B';
        int it3 = cr;
        System.out.println(it3);


    }
}
