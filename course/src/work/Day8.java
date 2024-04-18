package work;

import java.util.Scanner;

public class Day8 {
    public static void head1() {

        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        count(line);
    }

    private static void count(String line) {
        int numberCount = 0;
        int letterCount = 0;
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); i++) {
            char ca = line.charAt(i);
            if ((ca <= 'z' && ca >='a' ) || (ca <= 'Z' && ca >= 'A')){
                letterCount ++;

            } else if (ca >= '0' && ca<= '9') {
                numberCount ++;

            }

        }
        System.out.println("letterCount = " + letterCount);
        System.out.println("numberCount = " + numberCount);

    }


    public static boolean head2(String numbers) {

        if (numbers.length() != 18){
            return false;
        }
        for (int i = 0; i < numbers.length(); i++) {
            char ca = numbers.charAt(i);
            if (ca >= '0' && ca <='9'){
                return true;
            } else if (i == 18 ) {
                if (ca == 'X'){
                    return true;
                }
            }else if( (numbers.charAt(1) != 0)){
                return true;
            }
        }
        return false;

    }
}
