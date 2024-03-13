package imook_algorithm.sort;

/**
 * @author xzc
 * @date 2024/3/7 15 38:18
 * @description
 */
public class InsertionSort {
    private InsertionSort() {
    }

    //插入排序
    public static <E extends Comparable<E>> void sort(E[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            //将arr[i]插入到合适的位置
//            for (int j = i; j - 1 >= 0; j--) {
//                if (arr[j].compareTo(arr[j - 1]) < 0) {
//                    swap(arr, j, j - 1);
//                } else {
//                    break;
//                }
//            }
            //优化写法
            for (int j = i; j-1 >0&& arr[j].compareTo(arr[j - 1]) < 0; j++) {
                swap(arr, j, j - 1);
            }
        }
    }

    private static <E>void swap(E[] arr, int i, int swapIndex) {
        E t=arr[i];
        arr[i]=arr[swapIndex];
        arr[swapIndex]=t;
    }
}
