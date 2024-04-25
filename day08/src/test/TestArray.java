package test;

import java.util.ArrayList;

public class TestArray {

    public static void testString(){

        ArrayList<String> list = new ArrayList<>();

        list.add("2");
        list.add("正新鸡排");
        list.add(1,"0");
        System.out.println("list = " + list);
        list.add(1,"信球");
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        list.remove("0");
        list.remove(2);
        System.out.println(list);
        list.set(1,"星球大战");
        System.out.println("list = " + list);

    }
}
