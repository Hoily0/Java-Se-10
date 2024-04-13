package utils;


import java.util.Iterator;
import java.util.function.Consumer;

public class LinkList implements Iterable<Integer> {
    private Node head = null;


    @Override
    public Iterator<Integer> iterator() {
        return new NodeIterator();
    }


    private static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int value){
//        head = new Node(value,null);//链表为空
        head = new Node(value,head);//链表不为空
    }

    public void loop(Consumer<Integer> consumer){
        Node p = head;
        while(p != null){
//            System.out.println(p.value);
            consumer.accept(p.value);
            p =p.next;
        }
    }

    public void loop2(Consumer <Integer> consumer){
        for (Node p = head; p!=null; p = p.next){
            consumer.accept(p.value);
        }
    }

    private class NodeIterator implements Iterator<Integer> {
        Node p = head;


        @Override
        public boolean hasNext() {//询问是否有下一个元素
            return p != null;
        }

        @Override
        public Integer next() {//返回当前元素的值，并指向下一个元素
            int v= p.value;
            p = p.next;
            return v;
        }
    }
}

