package com.itheima;

import java.util.Arrays;
import java.util.Random;


/**
 * 抢红包_方案一
 *
 * 一个大V直播时发起了抢红包活动，分别有：9、666、188、520、99999五个红包。
 * 请模拟粉丝来抽奖，按照先来先得，随机抽取，抽完即止，
 * 注意：一个红包只能被抽一次，先抽或后抽哪一个红包是随机的，示例如下（不一定是下面的顺序）
 *
 * 写个for循环控制抽奖5次，每次抽奖，都从数组中随机找出一个金额，如果该金额不是0，则代表抽中，
 * 接着用0替换该位置处的金额，然后继续下一个粉丝的抽奖；
 * 如果抽中的金额发现是0，代表该位置处的红包之前被别人抽走了，则从新从数组中随机找出一个金额，继续判断！直至抽中的金额不是0！
 */
public class Case06 {
    public static void main(String[] args) {

        int[] price = {9, 666, 188, 520, 99999};
        int[] probability = lottery(price);
        System.out.println("probability = " + Arrays.toString(probability));
    }

    private static int[] lottery(int[] price) {
        Random random = new Random();

        int[] newArray = new int[price.length];
        boolean[] used = new boolean[price.length]; // 用于标记原始数组中的元素是否已经被使用过

        for (int i = 0; i < price.length; i++) {
            int index;
            do {
                index = random.nextInt(price.length); // 随机生成一个索引
            } while (used[index]); // 如果该索引对应的元素已经被使用过，则重新生成

            newArray[i] = price[index]; // 将随机选择的元素复制到新数组中
            used[index] = true; // 标记该元素已经被使用过
        }

        return newArray;
    }



}
