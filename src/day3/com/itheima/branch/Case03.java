package day3.com.itheima.branch;

import java.util.Scanner;

/**
 * 密码校验
 */
public class Case03 {
    public static void main(String[] args) {
        //需求: 键盘录入用户密码, 如果密码为 111111, 程序输出密码正确，否则输出密码有误
        System.out.println("请输入密码");
        Scanner sc = new Scanner(System.in);
        int passWord = sc.nextInt();

        if (passWord == 111111){
            System.out.println("密码正确");
        }else{
            System.out.println("密码错误");
        }


    }
}
