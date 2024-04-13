package day2.com.ithema;

/**
 * 赋值运算符
 *
 * 基本的赋值运算符：= (从右边往左看)
 * 扩展的赋值运算符：+=、-=、*=、/=、%=
 */
public class Case10 {

    public static void main(String[] args) {
//        int i= 3;
//        i *= 3;
//        System.out.println("i = " + i);
        float f1 = 2.9999F;
        float f2 = 3.000001F;
        System.out.println((int)f1);
        System.out.println((int)f2);
        byte a = 10;
        char b = 'a';
        int c = a + b;
        System.out.println(c);
    }
}
