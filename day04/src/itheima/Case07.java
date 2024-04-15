package itheima;

public class Case07 {
    public static void main(String[] args) {
        //需求:某班级学生的Java考试成绩是：99, 100, 62, 15, 48, 65, 98, 99, 5, 59.5, 75; 请统计及格学生总人数。
         double[] score = {99, 100, 62, 15, 48, 65, 98, 99, 5, 59.5, 75};
         int count = 0;

        for (int i = 0; i < score.length; i++) {
            if (score[i] >=60){
                count ++;
            } else if (score[i] < 60) {
//                System.out.println(score[i]);
                score[i] = score[i + 1];
                if (score[i] < 60){
                    score[i] = score[i + 1];
                }
                System.out.println("剔除后"+score[i]);
            }
        }
//        System.out.println(score[]);
    }
}
