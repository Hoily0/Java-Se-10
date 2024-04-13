package day2.com.ithema;

/**
 * 自增自减 与 自增自减注意
 *
 * 自增：++ 放在某个变量前面或者后面，对变量自身的值加1
 * 自减：-- 放在某个变量前面或者后面，对变量自身的值减1
 * 注意：
 *      ++ 、-- 只能操作变量，不能操作字面量的。
 *
 * ++、--如果不是单独使用（如在表达式中、或者同时有其它操作），放在变量前后会存在明显区别
 *      放在变量的前面，先对变量进行+1、-1，再拿变量的值进行运算。
 *      放在变量的后面，先拿变量的值进行运算，再对变量的值进行+1、-1
 */
public class Case08 {
    public static void main(String[] args) {
        int n = 10;
        int rs = n++;
        System.out.println("rs = " + rs);

        int rs2 = ++n;
        System.out.println("rs2 = " + rs2);


    }
}
