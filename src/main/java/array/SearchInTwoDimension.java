package array;

/**
 *
 */
public class SearchInTwoDimension {
    public static boolean Find(int target, int[][] array){
        if(array == null || array.length == 0){
            return false;
        }
        //遍历每一行
        for(int i = 0; i < array.length;i++){
            int len = array[i].length;//获取每一行的长度
            //下面两个if判断语句在牛客网中，当输入数组array为长度为0的数组时，会报访问越界错误。
            //代码分析及测试表明是牛客的问题
            if(array[i][0] > target){
                //如果该行的最小值比目标值大，则array中剩余的值都比目标值大，停止遍历
                break;
            }
            if(array[i][len-1] < target){
                //如果该行的最大值比目标值小，继续遍历下一行
                continue;
            }
            //对该行进行二分查找
            int start = 0;
            int end = len - 1;
            while(start <= end){
                int middle = (start + end) / 2;
                if(array[i][middle] == target){
                    return true;
                }else if(array[i][middle] < target){
                    start = middle + 1;
                }else{
                    end = middle - 1;
                }
            }
        }

        return false;
    }
}
