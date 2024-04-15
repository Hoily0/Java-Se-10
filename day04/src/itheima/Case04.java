package day4.com.itheima;

public class Case04 {
    public static void main(String[] args) {
        //需求：某部门5名员工的销售额分别是：16, 26, 36, 6, 100，请计算出他们部门的总销售额
        int[] sales = {16, 26, 36, 6, 100};
        int totalSales = 0;

        for (int sale : sales){
            totalSales += sale;
        }
        System.out.println(totalSales);
    }
}
