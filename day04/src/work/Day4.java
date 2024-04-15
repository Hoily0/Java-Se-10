package work;

import java.util.Random;
import java.util.Scanner;

public class Day4 {

    public static void head1(){
        int[] nums = new int[6];

        for (int i = 0; i < nums.length; i++) {
            System.out.print(i);

            if (i != nums.length -1){
                System.out.print(",");
            }
        }
    }

    public static void head2() {
        double[] dbNums = {12.9, 53.54, 75.0, 99.1, 3.14};
        double min = dbNums[0];

        for (int i = 0; i < dbNums.length - 1; i++) {

            if (dbNums[i] > dbNums[i + 1]){
                min = dbNums[i + 1];
            }
        }
        System.out.println(min);

    }

    public static void head3() {
        int[] nums = new int[6];
        Random random = new Random();
        int add = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(101);
            add += nums[i];
        }
        System.out.println(add);

    }

    public static void head4() {
        int[] nums = {72, 89, 65, 97, 91, 82, 71 ,93, 76, 68};
        int sum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i];
        }
        System.out.println("平均成绩："+(sum * 1.0 / (nums.length -1)));
    }

    public static void head5() {

        double[] stock = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5 };
        int loseMoney = 0;
        int makeMoney = 0;

        for (double v : stock) {

            if (v > 0) {
                makeMoney++;
                System.out.println(v);
            } else if (v < 0) {
                loseMoney++;

            }
        }

        System.out.println("赚钱的股票一共有："+makeMoney);
        System.out.println("赔钱的股票一共有："+loseMoney);
    }



    public static void head6() {
        int[] nums = new int[10];
        int[] oddNumber = new int[10];

        Scanner sc = new Scanner(System.in);

        int oddIndex = 0; // 奇数数组的索引

        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数值");
            nums[i] = sc.nextInt();
            if (nums[i] % 2 != 0) {
                oddNumber[oddIndex] = nums[i];
                oddIndex++; // 更新奇数数组的索引
            }
        }

// 将原始数组中的元素逆序放入奇数数组的末尾
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                oddNumber[oddIndex] = nums[i];
                oddIndex++; // 更新奇数数组的索引
            }
        }

// 打印奇数数组
        System.out.println("数组：");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumber[i] + " ");
        }

    }
}
