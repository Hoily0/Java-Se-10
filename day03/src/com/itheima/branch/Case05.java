package com.itheima.branch;

/**
 * swith注意事项
 *
 * 表达式类型只能是byte、short、int、char，JDK5开始支持枚举，JDK7开始支持String。
 * 正常使用switch的时候，不要忘记写break，否则会出现穿透现象。
 * case给出的值不允许重复，且只能是字面量，不能是变量。
 *
 * 穿透案例
 * 周一：埋头苦干，解决bug             周五：自己整理代码
 * 周二：请求大牛程序员帮忙            周六：打游戏
 * 周三：请求大牛程序员帮忙            周日：打游戏
 * 周四：请求大牛程序员帮忙
 */
public class Case05 {
    public static void main(String[] args) {

    }
}
