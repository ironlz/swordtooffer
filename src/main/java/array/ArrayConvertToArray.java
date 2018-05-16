package array;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class ArrayConvertToArray {
    public int[] multiply(int[] A) {
        if(A == null){
            return null;
        }
        // 如果可以用除法的话算法复杂度为2n
        //最简单的方法就是挨个相乘，算法复杂度是n（n-1）
        int[] result = new int[A.length];
        for(int i = 0; i < result.length; i++) {
            result[i] = 1;
            for(int j = 0; j < A.length; j++) {
                if(i == j)
                    continue;
                result[i] *= A[j];
            }
        }
        return result;

    }
}
