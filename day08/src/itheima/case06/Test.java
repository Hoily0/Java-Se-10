package com.itheima.case06;

/**
 * 开发验证码
 *
 * 需求：
 *      实现随机产生指定位数的验证码，验证码的每位可能是数字、大写字母、小写字母。
 * 分析：
 *      1.设计一个方法，该方法接收一个整型参数，最终要返回对应位数的随机验证码。
 *      2.方法内定义2个字符串变量：1个用来记住生成的验证码，1个用来记住要用到的全部字符
 *          String code = "";
 *          String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
 *      3.定义for循环控制生成多少位随机字符，每次得到一个字符串范围内的随机索引，根据索引提取该字符，
 *      4.把该字符交给code变量连接起来，循环结束后，在循环外返回code即可。
 *      5.主程序中，调用该方法即可得到随机验证码了
 */

public class Test {
    public static void main(String[] args) {


    }

}
