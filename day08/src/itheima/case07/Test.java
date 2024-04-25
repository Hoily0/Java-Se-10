package itheima.case07;

import java.util.ArrayList;
import java.util.Arrays;

/*
    创建ArrayList集合对象

    java.util.ArrayList<E>:
    <E>: 是泛型,在这里是用来限制集合中元素的数据类型(能写引用数据类型,不能写基本数据类型)
        基本类型      包装类类型
        byte        Byte
        short       Short
        int         Integer
        long        Long
        char        Character
        float       Float
        double      Double
        boolean     Boolean
*/
public class Test {
    public static void main(String[] args) {
        //创建ArrayList对象
        ArrayList arrayList = new ArrayList();

        // 需求: 创建ArrayList集合,限制集合中元素的类型为String
        ArrayList<String> arrayList1 = new ArrayList<>();

        // 需求: 创建ArrayList集合,限制集合中元素的类型为整数类型
        ArrayList<Integer> list = new ArrayList<>();

        // 需求: 创建ArrayList集合,限制集合中元素的类型为浮点类型
        ArrayList<Double> list1 = new ArrayList<>();

        // 泛型这个位置只能写引用数据类型,不能写基本数据类型
    }
}
