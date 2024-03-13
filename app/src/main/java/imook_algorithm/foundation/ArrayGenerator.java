package imook_algorithm.foundation;

/**
 * @author xzc
 * @date 2024/3/4 21 24:30
 * @description
 */
public class ArrayGenerator {

    private ArrayGenerator() {
    }

    //生成一个长度为n的顺序数组
    public static Integer[] generateOrderedArray(int n) {

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = i;
        return arr;
    }

    //生成一个长度为n的随机数组
    public static Integer[] generateRandomArray(int n, int bound) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = (int) (Math.random() * bound);
        return arr;
    }
}
