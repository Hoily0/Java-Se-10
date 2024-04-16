package work;

public class Day6 {


    public static void head1() {
        for (int i = 1; i <= 100; i++) {
            if (( i % 7 == 0) || (((i / 10) % 7 == 0) && i> 9) || (i % 10 == 7)){
                System.out.println(i);

            }
        }


    }

    public static int head2(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if ((num % 2 == 0) && (num / 10 % 10 != 7)) {
                sum += num;
                System.out.println(num);
            }
        }
        return sum;
    }


    public static int head3(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return -1;

    }
}
