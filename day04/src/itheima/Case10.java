package day4.com.itheima;

public class Case10 {
    public static void main(String[] args) {
        // 需求: 找数组的最大值
        //int[] faceScores = {15, 9000, 10000, 20000, 9500, -5};
        int[] faceScores = {15, 9000, 10000, 20000, 9500, -5};
        int max = faceScores[0];

        for (int i = 0; i < faceScores.length - 1; i++) {
            if (faceScores[i] < faceScores[i + 1]){         //寻找相邻最大值
                max = faceScores[i + 1];
            }
        }

        System.out.println(max);
    }
}
