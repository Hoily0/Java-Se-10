package com.itheima;

/**
 * 买飞机票
 *
 * 用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，
 * 优惠方案如下：5-10月为旺季，头等舱9折，经济舱8.5折； 11月到来年4月为淡季，头等舱7折，经济舱6.5折，
 * 请开发程序计算出用户当前机票的优惠价。
 */
public class Case01 {

    public static void main(String[] args) {
        int endPrice = specialPrice("经济舱", 1000, 12);
        System.out.println(endPrice);

    }

    private static int specialPrice(String cabin, int originalPrice, int month) {
        if(month <= 10 && month >= 5){          //旺季
            switch (cabin){
                case "头等舱" :
                    originalPrice *= 0.9;
                    break;
                case "经济舱":
                    originalPrice *= 0.85;

            }
        } else {
            switch (cabin){
                case "头等舱":
                    originalPrice *= 0.7;
                    break;
                case "经济舱":
                    originalPrice *= 0.65;
            }

        }
        return originalPrice;
    }


}
