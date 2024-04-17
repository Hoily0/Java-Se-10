package list;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ListArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("输入选项");
        System.out.println("1：上架菜品");
        System.out.println("2：菜品信息");

        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("-----上架菜品-----");

                System.out.println("名称");
                String name = sc.next();
                list.add(name);

                System.out.println("原价");
                String originalPrice = sc.next();
                list.add(originalPrice);

                System.out.println("优惠价");
                String specialPrice = sc.next();
                list.add(specialPrice);

                System.out.println("信息");
                String info = sc.next();
                list.add(info);



            case 2:
                System.out.println("菜品信息");
                System.out.println(list);
        }
    }


}
