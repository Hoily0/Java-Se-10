package itheima.case03;

import jdk.jshell.spi.SPIResolutionException;

import java.util.Arrays;

/**
 * 操作字符串数据的方法
 *
 * 字符串常用方法
 */
public class Test2 {
    public static void main(String[] args) {

        String str = "fdaa1fd14a1f0a1fFAS973121F房价a1f开始发你";
        System.out.println("str = " + str);

        //public String[] split(String regex) 	把字符串按照某个字符串内容分割，并返回字符串数组回来

        String splitStr = "a1f";
        System.out.println("str.split(splitStr) = " + Arrays.toString(str.split(splitStr)));

        //public String substring(int beginIndex, int endIndex) 	根据开始和结束索引进行截取，得到新的字符串（包前不包后）
        System.out.println("str.substring(23,30) = " + str.substring(23, 30));

        //public String substring(int beginIndex) 	从传入的索引处截取，截取到末尾，得到新的字符串返回
        System.out.println("str.substring(3,31) = " + str.substring(15));

        //public String replace(CharSequence target, CharSequence replacement) 	使用新值，将字符串中的旧值替换，得到新的字符串
        System.out.println("str.replace(\"a1f\",111) = " + str.replace("a1f","111"));

    }
}
