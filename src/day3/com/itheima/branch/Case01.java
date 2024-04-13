package day3.com.itheima.branch;

/**
 * if条件分支
 */
public class Case01 {
    public static void main(String[] args) {
        //if第一种形式
        //练习: 测量用户体温，发现体温高于37度就报警。
        //定义用户的体温
        double tw = 38.5;
        if(tw > 37){
            System.out.println("温度过高，直接隔离。。。。。");
        }
        //if第二种形式
        //练习：发红包，你的钱包余额是99元，现在要发出90元，如果钱不够，则提示：余额不足。
        //定义我的钱包余额99
        int money = 89;
        if(money >= 90){
            System.out.println("红包发送成功了");
        }else{
            System.out.println("余额不足");
        }
        //if第三种形式
        //练习：某个公司有一个绩效系统，根据员工的打分输出对应的绩效级别。
        //[0,60) D  [60,80) C [80,90) B [90,100] A。
        //定义员工的分数
        int score = 200;//-100 200
        if(score >=0 && score <= 60){
            System.out.println("D............");
        }else if(score > 60 && score <= 80){
            System.out.println("C............");
        }else if(score > 80 && score <= 90){
            System.out.println("B............");
        }else if(score > 90 && score <= 100){
            System.out.println("A............");
        }else{
            System.out.println("哥们 你的分数非法了。。。。");
        }
        //if(条件){}，()后不能跟“;”否则{}中的代码将不受if的控制了。
        int age = 17;
        //age(17) > 18 --->false
        if(age > 18);   //此处分号一定要删除 ，否则逻辑出问题
        {
            System.out.println("成年了。。。。。。");
        }
        //如果if语句的{}中只有一行代码的情况，{}可以省略不写（但是不推荐省略）。
        if(age > 18) {
            System.out.println("66666成年了。。。。。。");
            System.out.println("66666。。。。。。");
        }
    }
}
