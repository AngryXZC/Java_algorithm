package imook_algorithm.sort;

import imook_algorithm.foundation.ArrayGenerator;
import imook_algorithm.foundation.SortingHelper;

import java.util.Arrays;
import java.util.Random;

/**
 * @author xzc
 * @date 2024/7/8 17 16:18
 * @description 针对快速排序的优化
 */
public class OptimizeQuickSort {

    private OptimizeQuickSort(){}

    public   static  <E extends Comparable<E>> void sort(E[] arr){
//        sort(arr,0, arr.length-1);
//        sort2(arr,0, arr.length-1);
        sort3(arr,0, arr.length-1);
    }

    private  static <E extends Comparable<E>> void  sort(E[] arr,int l,int r){
        if(l>=r) return;
        int p=partition(arr,l,r);
        sort(arr,l,p-1);
        sort(arr,p+1,r);
    }

    private static <E extends Comparable<E>> int partition(E[] arr, int l, int r) {
        E v = arr[l];
        //arr[l+1...j]<v;arr[j+1...i-1)>=v
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i].compareTo(v) < 0) {
                j++;
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);
        return j;
    }

    private static   <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    //优化方案一：对于小规模数组，使用插入排序
    private static <E extends Comparable<E>> void sort2(E[] arr, int l, int r){

        // 使用 Insertion Sort 优化
        if(r - l <= 15){
            InsertionSort.sort(arr, l, r);
            return; // 注意，这里要 return！
        }

        int p = partition(arr, l, r);
        sort(arr, l, p - 1);
        sort(arr, p + 1, r);
    }

    //优化方案二：随机选择标定点
    private static <E extends Comparable<E>> int partition2(E[] arr, int l, int r){

        // 生成 [l, r] 之间的随机索引
        int p = (new Random()).nextInt(r-l+1) + l;
        swap(arr, l, p);

        E v = arr[l];
        // arr[l+1...j] < v ; arr[j+1...i) >= v
        int j = l;
        for(int i = l + 1; i <= r; i ++)
            if(arr[i].compareTo(v) < 0){
                j ++;
                swap(arr, j, i);
            }

        swap(arr, l, j);

        return j;
    }
    private  static <E extends Comparable<E>> void  sort3(E[] arr,int l,int r){
        if(l>=r) return;
        int p=partition2(arr,l,r);
        sort(arr,l,p-1);
        sort(arr,p+1,r);
    }
    public static void main(String[] args){
        int n=1000000;
        Integer[] arr= ArrayGenerator.generateRandomArray(n,n);
        Integer[] arr2= Arrays.copyOf(arr,arr.length);
        SortingHelper.sortTest("QuickSort",arr);
        //方案一：对于小规模数组，使用插入排序
        SortingHelper.sortTest("QuickSort2",arr2);
        //方案二：随机选择标定点
        SortingHelper.sortTest("QuickSort3",arr2);

    }
}
