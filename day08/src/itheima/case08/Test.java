package com.itheima.case08;


import java.util.ArrayList;
import java.util.Objects;

/**
 * 操作ArrayList集合对象
 *
 * ArrayList<E> 操作ArrayList集合对象: 对集合元素增删改查操作
 */
public class    Test {
    public static void main(String[] args) {
        // 创建ArrayList集合,限制集合元素类型为String
        ArrayList<String> arrayList = new ArrayList<>();

        //public boolean add(E e)	将指定的元素添加到此集合的末尾
        arrayList.add("#124");

        //public void add(int index,E element)	在此集合中的指定位置插入指定的元素
        arrayList.add(0,"fdasih");

        //public E remove(int index)	删除指定索引处的元素，返回被删除的元素
        arrayList.remove(1);

        //public boolean remove(Object o)	删除指定的元素，返回删除是否成功
        arrayList.remove("#124");

        //public E set(int index,E element)	修改指定索引处的元素，返回被修改的元素
        arrayList.set(0,"你好哦");

        //public E get(int index)	返回指定索引处的元素
        System.out.println(arrayList.get(0));

        //public int size()	返回集合中的元素的个数
        System.out.println("arrayList.size() = " + arrayList.size());

        //for循环遍历集合中的每个元素
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("arrayList.get(i) = " + arrayList.get(i));
        }
        // 创建ArrayList集合对象,指定集合元素类型为整数类型
        ArrayList<Integer> list = new ArrayList<>();
        list.add(31);
        list.add(0,23);
        list.add(12);
        //public E remove(int index)	删除指定索引处的元素，返回被删除的元素
        list.remove(0);

        //public boolean remove(Object o)	删除指定的元素，返回删除是否成功
//        Integer integer = new Integer(31);
//        Integer integer = 31;
        Object integer = 31;
        list.remove(integer);



    }
}