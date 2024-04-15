package com.itheima.loop;

/**
 * 死循环
 */
public class Case08 {
    public static void main(String[] args) {

        int count = 0;
        double ram = Math.pow(2,32) ;   //

        while (true){
            count ++;
            System.out.println(count);
            System.out.println(ram * count+"B");
        }


    }
}
