package itheima;

public class Case02 {
    public static void main(String[] args) {
        // 1.静态初始化一个整型数组
        int[] nums = {1, 43, 4231, 4, 9, 75, 98};

        // 2.访问数组元素: 数组名[索引]   记住: 索引是从0开始的,每次递增1
        // 2.1 获取数组中的元素

        System.out.println(nums[1]);

        // 2.2 修改数组中的元素
        nums[1] = -50;

        // 2.3 获取数组中的元素
        System.out.println(nums[1]);

        // 2.4 获取数组长度: 数组名.length     数组中元素的最大索引: 数组长度-1
        System.out.println(nums.length);

        // 2.5 数组索引越界异常
//        System.out.println(nums[99]);

    }
}
