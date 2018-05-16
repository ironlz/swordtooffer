package array;

import java.util.HashSet;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class FindDuplicateNumber {
    /**
     *
     * @param numbers an array of integers
     * @param length the length of array numbers
     * @param duplication (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
     * @return true if the input is valid, and there are some duplications in the array number
     */
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        //直接使用java库的set数据结构，求相等用hash，可以将时间复杂度降低到n
        if(numbers != null && numbers.length > 0) {
            HashSet<Integer> test = new HashSet<>();
            for (int i : numbers) {
                if (test.contains(i)) {
                    duplication[0] = i;
                    return true;
                }
                test.add(i);
            }
        }
        return false;
    }

}
