package itheima.case03;

/**
 * 操作字符串数据的方法
 */
public class Test3 {
    public static void main(String[] args) {
        String str = "2134FEfeaFEAS134建瓯打死你发";
        //public boolean equals(Object anObject) 	判断当前字符串与另一个字符串的内容一样，一样返回true  参数是Object类型,可以传入任意类的对象
        String str1 = "2134FEfeaFEAS134建瓯打死你发";
        System.out.println("str.equals(str1) = " + str.equals(str1));

        //public boolean contains(CharSequence s)	判断字符串中是否包含了某个字符串
        String string = "213FE";
        System.out.println("str.contains(string) = " + str.contains(string));

        //public boolean startsWith(String prefix)	判断字符串是否以某个字符串内容开头，开头返回true，反之
        System.out.println("str.startsWith(\"21\") = " + str.startsWith("21"));

        //public boolean endsWith(String suffix)    判断字符串是否以某个字符串内容结尾，结尾返回true，反之
        System.out.println("str.endsWith(\"你发\") = " + str.endsWith("你发"));

        //public boolean equalsIgnoreCase(String anotherString)	判断当前字符串与另一个字符串的内容是否一样(忽略大小写)
        String strCase = "2134FEfFEAFEAS134建瓯打死你发";
        System.out.println("str.equalsIgnoreCase(strCase) = " + str.equalsIgnoreCase(strCase));

    }
}
