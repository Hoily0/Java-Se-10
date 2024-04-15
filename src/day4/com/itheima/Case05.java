package day4.com.itheima;

/**
 * 动态初始化数组: 数据类型[] 数组名 = new 数据类型[长度];
 * 动态初始化数组,数组元素有默认值
 * 整型数组元素的默认值为0
 * 字符型数组元素的默认值为0
 * 小数型数组元素的默认值为0.0
 * 布尔型数组元素的默认值为false
 * 引用类型数组元素的默认值为null
 */
public class Case05 {
    public static void main(String[] args) {
        // 需求: 使用动态初始化长度为3的整型数组
        int[] arr5 = new int[3];

        // 需求: 使用动态初始化长度为3的字符型数组
        char[] chars = new char[3];

        // 需求: 使用动态初始化长度为3的小数型数组
        double[] doubles = new double[3];

        // 需求: 使用动态初始化长度为5的布尔型数组
        boolean[] booleans = new boolean[5];

        // 需求: 使用动态初始化长度为3的字符串型数组
        char[] chars1 = new char[3];

        // 给arr5数组中的元素赋值--修改值
        System.out.print("[");
        for ( int  arr = 0; arr < arr5.length ; arr++) {

            arr5[arr] = arr;

            System.out.print(arr5[arr]);

            if (arr == arr5.length -1){
                System.out.println("]");
            } else {
                System.out.print(",");

            }

        }

//        System.out.println("["+ +"]");



        // 注意:静态初始化和动态初始化数组的写法是独立的，不可以混用。
    }
}
