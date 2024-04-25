package itheima.case10;


import java.util.ArrayList;
import java.util.Scanner;

public class FoodService {


    ArrayList<Food> arrayList = new ArrayList<>();

    public void dishesOnShelves(ArrayList<Food> arrayList){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入菜品信息");
        System.out.println("请输入菜品名称");

        String name = sc.next();
        System.out.println("请输入菜品原价");
        double originalPrice = sc.nextDouble();
        System.out.println("请输入菜品优惠价");
        double specialPrice = sc.nextDouble();
        System.out.println("请输入菜品信息");
        String info = sc.next();
        Food food = new Food(name,originalPrice,specialPrice,info);
        arrayList.add(food);
    }



    public void showDishes(ArrayList<Food> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList);
        }

    }
}
