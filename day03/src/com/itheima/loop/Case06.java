package com.itheima.loop;

/**
 * while珠穆朗玛峰
 *
 * 需求：世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，
 * 假如我有一张足够大的纸，它的厚度是0.1毫米。请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？
 * double peakHeight = 8848860;  // 山峰高度
 * double paperThickness = 0.1;  // 纸张厚度
 */
public class Case06  {
    public static void main(String[] args) {

        int x = 2;//底数
        int count = 0;
        double mountainHeight = 8848860;
        double paperThickness = 0.1;

//        while (Math.log(mountainHeight*10) > 1){
//            count ++;
//            mountainHeight /= x   ;
//        }

        while(mountainHeight > paperThickness){
            count ++;
            paperThickness *= x;
        }

        System.out.println(count);
    }
}
