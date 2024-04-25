package test;

import java.util.Arrays;

public class TestString {
    public static void testString(){

        String str1 = "steadfast";
        String str5 = "steaDFast";
        String str2 = "谁告诉你的";
        String str3 = "4315534712345";
        String str4 = "4315534712345";
        String str8 = "4712345";
        System.out.println("str1.length() = " + str1.length());
        System.out.println("str1.charAt(3) = " + str1.charAt(3));
        System.out.println("str2.charAt(4) = " + str2.charAt(4));
        System.out.println("str3.toCharArray() = " + Arrays.toString(str3.toCharArray()));
        System.out.println(Arrays.toString(str2.toCharArray()));
        System.out.println("str3.equals(str4) = " + str3.equals(str4));
        System.out.println("str2.equals(str1) = " + str2.equals(str1));
        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));
        System.out.println("str1.equalsIgnoreCase(str5) = " + str1.equalsIgnoreCase(str5));
        System.out.println("str3.length() = " + str3.length());
        System.out.println("str3.substring(7,12) = " + str3.substring(8, 13));
        System.out.println("str5.substring(1) = " + str5.substring(1));
        System.out.println("str5.substring(0, 1) = " + str5.substring(0, 1));
        System.out.println("str4.replace(str4,str2) = " + str4.replace(str4, str2));
        System.out.println("str3.contains(\"1\") = " + str3.contains("1"));
        System.out.println("str3.contains(\"9\") = " + str3.contains("9"));
        System.out.println("str5.startsWith(\"1\") = " + str5.startsWith("1"));
        System.out.println("str2.startsWith(\"谁\") = " + str2.startsWith("谁"));
        System.out.println("str4.split(str8) = " + Arrays.toString(str4.split(str8)));
        System.out.println("str4.split(str2) = " + Arrays.toString(str4.split(str2)));
    }
}
