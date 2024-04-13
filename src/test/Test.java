package test;

import utils.LinkList;

public class Test {

    public void test1(){
        LinkList link = new LinkList();
        link.addFirst(1);
        link.addFirst(2);
        link.addFirst(3);
        link.addFirst(4);



        link.loop(System.out::println);
    }
    public void test2(){
        LinkList link = new LinkList();
        link.addFirst(1);
        link.addFirst(2);
        link.addFirst(3);
        link.addFirst(4);



        for (Integer value : link){
            System.out.println(value);
        }
    }



}
