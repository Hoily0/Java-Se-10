package day4.com.itheima;

public class Case11 {
    public static void main(String[] args) {
        //某个数组有5个数据：10,20,30,40,50，请将这个数组中的数据进行反转。
        // [10, 20, 30, 40, 50]  反转后 [50, 40, 30, 20, 10]

        int[] nums = {10, 20, 30, 40, 50};
        int[] reverse = new int[5];

//        System.out.print("[");
//        for (int i = 0; i <= nums.length - 1; i++) {
//
//            reverse[i] = nums[nums.length - i -1 ];
//            System.out.print(reverse[i]);
//
//            if (i != nums.length - 1){
//                System.out.print(",");
//            }
//        }


        int count = 0;
        int i;
        for ( i = 0; i < nums.length ; i++) {

            int temp = nums[i];
            nums[i] = nums[nums.length -1 -i];
            nums[nums.length - 1 - i] = temp;
            count ++;

            if (count >= (nums.length - 1) /2 ){
                break;
            }
        }
        System.out.print("[");

        for (int i1 = 0; i1 < nums.length; i1++) {
            if (i1 < nums.length -1){
                System.out.print(nums[i1]+", ");
            }
            else {
                System.out.print(nums[i1]);
            }
        }
        System.out.println("]");

    }
}
