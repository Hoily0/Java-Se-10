package ithema;

/**
 * 逻辑运算符
 *
 * 把多个条件放在一起运算，最终返回布尔类型的值：true、false。
 *      &   ：逻辑与    多个条件必须都是true, 结果才是true；  有一个是false，结果就是false
 *      |   ：逻辑或    多个条件中只要有一个是true, 结果就是true;
 *      !   ：逻辑非    就是取反：你真我假，你假我真。!true == false、!false == true
 *      ^   ：逻辑异或   前后条件的结果相同，就直接返回false，前后条件的结果不同，才返回true
 *
 *      &&  ： 短路与   判断结果与“&”一样，过程不同：左边为 false，右边则不执行。
 *      ||  ： 短路或   判断结果与“|”一样，过程不同：左边为 true， 右边则不执行。
 *
 *      注意：在java中， “&” 、 “|”:   无论左边是 false还是 true，右边都要执行。
 *
 */
public class Case12 {
    public static void main(String[] args) {

    }
}
