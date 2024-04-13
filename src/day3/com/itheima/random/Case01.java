package day3.com.itheima.random;

import java.util.Random;

/**
 * Random生成随机数
 */
public class Case01 {
    public static void main(String[] args) {

        //1.用循环获取10个随机数,随机数的范围是: [0,10),包含0,不包含10
        Random random = new Random();
        int result = random.nextInt(10);
        System.out.println(result);

        //2.获取一个1-100之间的随机数,包含1,包含100

        int result1 = random.nextInt(100);
        System.out.println(result+1);


        //3.获取一个20-50之间的随机数,包含20,包含50
        int result2 = random.nextInt(31);
        System.out.println(result+20);


    }
}
