import work.Day6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {


//        System.out.println("---------1---------");
//        Day6.head1();
//
//
//        System.out.println("---------2---------");
//        int[] array = {68, 27, 95, 88, 171, 996, 51, 210};
//        int result = Day6.head2(array);
//        System.out.println(result);


        System.out.println("---------3---------");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int[] arr = {19, 28, 37, 46, 50};

        int result = Day6.head3(arr, key);
        System.out.println(result);
    }

}
