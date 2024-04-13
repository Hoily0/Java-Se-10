package day3.com.itheima.loop;

import java.util.Scanner;

/**
 * 密码校验
 */
public class Case11 {
    public static void main(String[] args) {
        //需求： 系统密码是520，请用户不断的输入密码验证，验证不对输出：密码错误，验证成功
        // 输出：欢迎进入系统，并停止程序。
        int key = 520;

        Scanner sc= new Scanner(System.in);
        System.out.println("请输入密码");
        int userKey = sc.nextInt();

        while (key != userKey){
            System.out.println("密码错误，请重新输入");

            userKey =  sc.nextInt();
            System.out.println("密码正确");
        }
    }
}
