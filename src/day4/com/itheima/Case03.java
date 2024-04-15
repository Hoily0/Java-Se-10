package day4.com.itheima;

public class Case03 {
    public static void main(String[] args) {
        //遍历：就是将数组中的元素一个一个的取出来。
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int num : nums){
            System.out.println(num);
        }

//        for (int i = nums.length - 1; i >= 0; i--) {
//            System.out.println(nums[i]);
//        }
    }
}
