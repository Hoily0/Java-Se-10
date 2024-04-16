package com.itheima;

/**
 * 比较两个int类型的数组
 *
 * 需求：如果两个int类型的数组，元素个数，对应位置的元素内容都是一样的则认为这2个数组是一模一样的。
 */
public class Case10 {
    public static void main(String[] args) {
        int[] numsB ={ 1, 2, 3, 4, 5};
        int[] numsA = {1, 2, 3, 4 ,5};

        boolean result=  bothAreTheSame(numsA, numsB);
        System.out.println(result);

    }

    private static boolean bothAreTheSame(int[] array1, int[] array2) {

        if (array1.length != array2.length){
            return false;
        }

        for (int i : array1){
            if (array1[i] == array2[i]){
                return true;
            }
        }

        return false;
    }


}
