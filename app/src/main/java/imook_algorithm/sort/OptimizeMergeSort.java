package imook_algorithm.sort;

/**
 * @author xzc
 * @date 2024/7/3 16 24:03
 * @description
 */

import imook_algorithm.foundation.ArrayGenerator;
import imook_algorithm.foundation.SortingHelper;

import java.util.Arrays;


public class OptimizeMergeSort {
//自顶向下的归并排序
    private OptimizeMergeSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {

        sort(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r) {

        if (l >= r)
            return;

        int mid = l + (r - l) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    //优化方案一merge时判断一下是否有序
    public static <E extends Comparable<E>> void sort2(E[] arr) {

        sort2(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort2(E[] arr, int l, int r) {

        if (l >= r)
            return;

        int mid = l + (r - l) / 2;
        sort2(arr, l, mid);
        sort2(arr, mid + 1, r);

        // 优化
        if (arr[mid].compareTo(arr[mid + 1]) > 0)
            merge(arr, l, mid, r);
    }

    //优化方案二对数据规模小的时候使用插入排序

    public static <E extends Comparable<E>> void sort3(E[] arr) {

        sort3(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort3(E[] arr, int l, int r) {

//        if (l >= r)
//            return;
        if (r - l <= 15) {
            InsertionSort.sort(arr, l, r);
            return;
        }
        int mid = l + (r - l) / 2;
        sort3(arr, l, mid);
        sort3(arr, mid + 1, r);

        // 优化方案一
        if (arr[mid].compareTo(arr[mid + 1]) > 0)
            merge(arr, l, mid, r);
    }


    // 合并两个有序的区间 arr[l, mid] 和 arr[mid + 1, r]
    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r) {

        E[] temp = Arrays.copyOfRange(arr, l, r + 1);

        int i = l, j = mid + 1;

        // 每轮循环为 arr[k] 赋值
        for (int k = l; k <= r; k++) {

            if (i > mid) {
                arr[k] = temp[j - l];
                j++;
            } else if (j > r) {
                arr[k] = temp[i - l];
                i++;
            } else if (temp[i - l].compareTo(temp[j - l]) <= 0) {
                arr[k] = temp[i - l];
                i++;
            } else {
                arr[k] = temp[j - l];
                j++;
            }
        }
    }

    private static <E extends Comparable<E>> void merge2(E[] arr, int l, int mid, int r,E[] temp) {

//        E[] temp = Arrays.copyOfRange(arr, l, r + 1);
        System.arraycopy(arr, l, temp, l, r - l + 1);

        int i = l, j = mid + 1;

        // 每轮循环为 arr[k] 赋值
        for (int k = l; k <= r; k++) {

            if (i > mid) {
                arr[k] = temp[j];
                j++;
            } else if (j > r) {
                arr[k] = temp[i ];
                i++;
            } else if (temp[i ].compareTo(temp[j ]) <= 0) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
        }
    }

    //优化方案三，对merge进行优化
    public static <E extends Comparable<E>> void sort4(E[] arr) {
        E[] temp = Arrays.copyOf(arr, arr.length);
        sort4(arr, 0, arr.length - 1,temp);
    }

    private static <E extends Comparable<E>> void sort4(E[] arr, int l, int r,E[] temp) {

        if (l >= r)
            return;

        int mid = l + (r - l) / 2;
        sort4(arr, l, mid,temp);
        sort4(arr, mid + 1, r,temp);

        // 优化
        if (arr[mid].compareTo(arr[mid + 1]) > 0)
            merge2(arr, l, mid, r,temp);
    }

    // 自底向上的归并排序
    public static <E extends Comparable<E>> void sortBU(E[] arr) {

        E[] temp = Arrays.copyOf(arr, arr.length);

        int n = arr.length;

        // 使用插入排序优化
        // 遍历一遍，对所有 arr[i, i + 15] 的区间，使用插入排序法
        // 注意 i 每次加 16
        for(int i = 0; i < n; i += 16)
            InsertionSort.sort(arr, i, Math.min(i + 15, n - 1)); // 也要注意这里 Math.min 的用法

        // sz 为子数组的大小, 1, 2, 4, 8...
        for (int sz = 16; sz < n; sz += sz)
            // 遍历合并的两个区间的起始位置 i
            // 合并 arr[i...i+sz-1] 和 arr[i+sz...i+2*sz-1]
            for (int i = 0; i + sz < n; i += sz + sz)
                // 对 arr[i...i+sz-1] 和 arr[i+sz...i+2*sz-1] 进行归并
                if (arr[i + sz - 1].compareTo(arr[i + sz]) > 0)
                    if (arr[i + sz - 1].compareTo(arr[i + sz]) > 0)
                        merge2(arr, i, i + sz - 1, Math.min(i + sz + sz - 1, n - 1), temp);
    }

    public static void main(String[] args) {

        int n = 1000000;

        System.out.println("Random Array : ");
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);

        SortingHelper.sortTest("MergeSort", arr);
        SortingHelper.sortTest("MergeSort2", arr2);


        System.out.println("\nOrdered Array : ");
        arr = ArrayGenerator.generateOrderedArray(n);
        arr2 = Arrays.copyOf(arr, arr.length);

        SortingHelper.sortTest("MergeSort", arr);
        SortingHelper.sortTest("MergeSort2", arr2);
    }
}

