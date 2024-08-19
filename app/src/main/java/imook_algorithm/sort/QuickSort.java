package imook_algorithm.sort;

import imook_algorithm.foundation.ArrayGenerator;
import imook_algorithm.foundation.SortingHelper;

import java.util.Arrays;
import java.util.Random;

/**
 * @author xzc
 * @date 2024/7/8 16 23:59
 * @description 快速排序
 */
public class QuickSort {

    private QuickSort(){}

    public   static  <E extends Comparable<E>> void sort(E[] arr){
        Random rnd = new Random();
        sort(arr,0, arr.length-1,rnd);
    }

    private  static <E extends Comparable<E>> void  sort(E[] arr,int l,int r,Random rnd){
        // 使用 Insertion Sort 优化
        if(r - l <= 15){
            InsertionSort.sort(arr, l, r);
            return; // 注意，这里要 return！
        }
        int p=partition(arr,l,r,rnd);
        sort(arr,l,p-1,rnd);
        sort(arr,p+1,r, rnd);
    }
     private static <E extends Comparable<E>> int partition(E[] arr, int l, int r,Random rnd) {
            // 生成 [l, r] 之间的随机索引
            int p = rnd.nextInt(r-l+1) + l;
            swap(arr, l, p);
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

     public static void main(String[] args){
        int n=1000000;
        Integer[] arr= ArrayGenerator.generateRandomArray(n,n);
        Integer[] arr2= Arrays.copyOf(arr,arr.length);
        Integer[] arr3= Arrays.copyOf(arr,arr.length);
        SortingHelper.sortTest("MergeSort2",arr2);
        SortingHelper.sortTest("QuickSort",arr);
        SortingHelper.sortTest("QuickSort3 Ways",arr3);

     }
}
