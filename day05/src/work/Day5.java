package work;

public class Day5 {

    public static int head1(int a, int b) {
        return Math.abs(a - b);
//        int c = 0;
//        if (a < b) {
//            c = b - a;
//        } else if (a > b) {
//             c = a - b;
//        } else if (a == b) {
//             c= 0;
//        }
//        return c;
    }


    public static double head2(double num1, double num2) {
        return Math.min(num1, num2);
//        double min = 0;
//        if (num1 < num2){
//            min = num1;
//        } else if (num1 > num2) {
//            min = num2;
//        }
//        return min;
    }

    public static int head3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
//        return Math.max(a, (b > c ? b : c));
        

    }

    public static void head4(int rows, int list) {
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int i1 = 0; i1 < list; i1++) {
                System.out.print("@");
            }

        }

    }

    public static void head5(int[] array) {


        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                                                            //冒泡排序
                if (array[j] < array[j + 1]) {
                    // 交换元素位置
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int j : array) {
            System.out.println(j);
        }
    }

    public static double head6(double decimal) {
        return Math.abs(decimal);
//        if (decimal < 0){
//            return -decimal;
//        }else {
//            return decimal;
//        }



    }

}
