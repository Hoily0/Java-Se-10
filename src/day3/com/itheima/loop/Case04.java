package day3.com.itheima.loop;

/**
 * for水仙花数
 *
 * 需求：在控制台输出所有的“水仙花数”，水仙花数必须满足如下2个要求：
 * 定义一个for循环从“100一直到999”。
 * 各位数立方之和等于原数
 */
public class Case04 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 100; i <1000 ; i++) {

            if(Math.pow(i % 10,3) + Math.pow((i /10) %10,3) + Math.pow((i /100 ) %10,3) == i  ){
                System.out.println(i);
                count ++;
            }

        }
        System.out.println(count);
    }
}
