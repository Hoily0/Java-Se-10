import controller.AtmController;

import java.util.Arrays;
import java.util.Random;

public class Main9 {
    public static void main(String[] args) {
//        AtmController.atmAll();
        int[] arr = new int[5];
        Random rd =new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(99) + 1;
        }
        System.out.println(Arrays.toString(arr));

        int result = getScore(arr);//大于平均数的数量
        System.out.println(result);


    }


    public static int getScore(int[] arr){

        double sum = 0;

        for (int j : arr) {
            sum += j;
        }

        double average = sum / (arr.length);
        int count = 0;

        for (int j : arr) {
            if (j > average) {
                count++;
            }
        }
        return count;
    }
}
