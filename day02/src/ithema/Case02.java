package ithema;

/**
 * 数据类型的分类
 * 整型
 * byte            1           -2^7~2^7-1（-128~127）
 * short           2           -2^15~2^15-1（-32768~32767）
 * int(默认)        4           -2^31~2^31-1 (-2147483648~2147483647 10位数，大概21亿多)
 * long            8           -2^63~2^63-1 (-9223372036854775808~9223372036854775807 19位数)
 * 浮点型(小数)
 * float           4            1.401298 E -45 到 3.4028235 E +38
 * double（默认）    8           4.9000000 E -324 到1.797693 E +308
 * 字符型
 * char            2           0-65535
 * 布尔型
 * boolean          1           true，false
 */
public class Case02 {
    public static void main(String[] args) {
        // byte   1个字节
        byte bt = -128;
        // short  2个字节
        short st = -32768;
        // int   4个字节 (默认)
        int it = -342324121;
        // long  8个字节
        long lg = 2^793487943;
        // float 4个字节
        float ft = 809890342f;
        // double 8个字节（默认）
        double db = 0893214082432432453254235423534255235094028509435423.4;
        // char 2个字节
        char cr = 65535;
        // boolean 1个字节
        boolean bl = true;
    }
}
