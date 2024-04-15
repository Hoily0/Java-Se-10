package ithema;

/**
 * 自增、自减拓展案例
 */
public class Case09 {
    public static void main(String[] args) {
        int c = 10;
        int d = 5;
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(rs3);
        System.out.println(c);
        System.out.println(d);

    }
}
