package day3.com.itheima.loop;

/**
 * for求奇数和
 *
 * 需求：求1-10之间的奇数和，并把求和结果在控制台输出。
 */
public class Case03 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0){//奇数
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
