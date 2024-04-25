package itheima.case10;

import java.util.ArrayList;
import java.util.Scanner;

/*
 ArrayList综合案例

 需求: 完成菜品的上架、以及显示菜品信息(菜名name,菜品原价originalPrice,菜品优惠价specialPrice,菜品信息info)功能
      =============胡那样进入商家系统==============
      请输入功能序号：
      1.上架菜品
      2.显示菜品信息

 分析：
      1.初始化外卖商家系统
      2.上架菜品
      3.输出所有菜品信息
*/
public class Test {

    public static void main(String[] args) {

        merchant();


    }

    private static void merchant() {
        ArrayList<Food> arrayList = new ArrayList<>();

        while (true){
            System.out.println("=======进入系统=======");
            System.out.println("1.上架菜品");
            System.out.println("2.显示菜单信息");
            System.out.println("请输入选项");
            Scanner scanner = new Scanner(System.in);
            FoodService foodService = new FoodService();
            int choice =scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("上架菜品");

                    foodService.dishesOnShelves(arrayList);
                    System.out.println(arrayList);

                    break;
                case 2:
                    System.out.println("显示菜单");
                    foodService.showDishes(arrayList);

                    break;
                default:
                    System.out.println("没有该选项，请重新输入");
            }
        }

    }




}
