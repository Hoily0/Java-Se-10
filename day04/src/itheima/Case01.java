package itheima;

public class Case01 {
    public static void main(String[] args) {
        //需求: 使用静态初始化数组,存储3个同学的年龄
        int[] ages = {23, 19, 20};

        //需求: 使用静态初始化数组,存储3个同学的成绩
        double[] score = new double[]{48.9, 43, 50};

        //需求: 使用静态初始化数组,存储3个同学的姓名
        String[] names = new String[]{"零覅数额", "而化塑", "而爱上模块"};

        //需求: 使用静态初始化数组,存储3个字符
        char[] character = {'d', '[', '-'};

        //需求: 使用静态初始化数组,存储3个布尔值
        boolean[] bl = {true, false, true};
        System.out.println(bl[2]);
    }
}