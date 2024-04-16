import work.Day5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        System.out.println("---------1---------");
        System.out.println(Day5.head1(2, 7));


        System.out.println("---------2---------");
        System.out.println(Day5.head2(3189, 318));


        System.out.println("---------3---------");
        System.out.println(Day5.head3(123,312,9));

        System.out.println("---------4---------");
        Day5.head4(4, 5);


        System.out.println("---------5---------");
        Scanner sc= new Scanner(System.in);

        int[] array = {1, 20, 97};
        for (int i = 0; i < 3; i++) {
            array[i] = sc.nextInt();
        }
        Day5.head5(array);


        System.out.println("---------6---------");
        double decimalAbs =  Day5.head6(-314.3);
        System.out.println(decimalAbs);


    }



}
