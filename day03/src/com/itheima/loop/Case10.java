package com.itheima.loop;

/**
 * 跳转关键字
 *
 * break : 只能用于结束所在循环, 或者结束所在switch分支的执行。
 * continue : 只能在循环中进行使用。
 */
public class Case10 {
    public static void main(String[] args) {
        //练习1:黑马毕业后顺利进入阿里巴巴，每天996，第7天的时候干的不爽直接离职了
        for (int num = 0; num < 8; num++) {
            switch (num){
                case 1:
                    System.out.println(991);//可用来当作循环
                    break;
                case 2:
                    System.out.println(992);
                    break;
                case 3:
                    System.out.println(993);
                    break;
                case 4:
                    System.out.println(994);
                    break;
                case 5:
                    System.out.println(995);
                    break;
                case 6:
                    System.out.println(996);
                    break;
                case 7:
                    System.out.println(997);
                    break;

            }
        }

        //练习2:黑马毕业后顺利进入阿里巴巴，每天996，第7天的时候请了假，假期后继续996

    }
}
