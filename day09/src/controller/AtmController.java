package controller;

import service.AtmService;

import java.util.Scanner;

public class AtmController {

    public static void atmAll(){

        while (true) {

            System.out.println("============欢迎进入黑马银行ATM系统============");
            System.out.println("===================1.登录=================");
            System.out.println("===================2.注册=================");
            System.out.println("===================请输入你的业务=================");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("============欢迎进入登录界面============");
                    AtmService.findAll();
                    break;
                case 2:
                    System.out.println("============欢迎进入黑马银行用户办卡界面============");
                    AtmService.loginAccount();
                    break;
                default:
                    System.out.println("没有该选项");


            }


        }
    }
}
