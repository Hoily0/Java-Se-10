package verify;

import java.util.Random;
import java.util.Scanner;

public class Verify {

    public static void main(String[] args) {

        System.out.println("输入验证码长度");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String  code = generateCode(num);
        System.out.println(code);
    }

    private static String generateCode(int num) {

        StringBuilder code = new StringBuilder();
        String data = "abcdefghijklmnopqrstuvwxyzQWERTYUIOPLKJHGFDSAZXCVBNM1234567890";

        Random rd = new Random();

        for (int i = 0; i < num; i++) {
            int index = rd.nextInt(data.length() -1);
            code.append(data.charAt(index));
        }
        return code.toString()

                ;


    }


}
