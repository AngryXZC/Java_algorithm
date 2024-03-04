package imook_algorithm.foundation;

/**
 * @author xzc
 * @date 2024/3/4 21 24:30
 * @description
 */
public class ArrayGenerator {

    private ArrayGenerator(){}

    public static Integer[] generateOrderedArray(int n){

        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i ++)
            arr[i] = i;
        return arr;
    }
}
