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


    //双路快速排序，解决重复元素多的情况
    public   static  <E extends Comparable<E>> void sort2ways(E[] arr){
        Random rnd = new Random();
        sort2ways(arr,0, arr.length-1,rnd);
    }


    private  static <E extends Comparable<E>> void  sort2ways(E[] arr,int l,int r,Random rnd){
        if(l>=r) return;
        int p=partition2(arr,l,r,rnd);
        sort2ways(arr,l,p-1,rnd);
        sort2ways(arr,p+1,r, rnd);
    }
    private static <E extends Comparable<E>> int partition2(E[] arr, int l, int r,Random rnd) {
        // 生成 [l, r] 之间的随机索引
        int p = rnd.nextInt(r-l+1) + l;
        swap(arr, l, p);

        //arr[l+1...i-1]<=v;arr[j+1...r]>=v
        int i=l+1,j=r;
        while (true){
            while (i<=j&&arr[i].compareTo(arr[l])<0){
                i++;
            }
            while (j>=i&&arr[j].compareTo(arr[l])>0){
                j--;
            }
            if(i>=j){
                break;
            }
            swap(arr,i,j);
            i++;
            j--;
        }
        swap(arr,l,j);
        return j;
    }
    //三路快排
    public   static  <E extends Comparable<E>> void sort3ways(E[] arr){
        Random rnd = new Random();
        sort3ways(arr,0, arr.length-1,rnd);
    }


    private  static <E extends Comparable<E>> void  sort3ways(E[] arr,int l,int r,Random rnd){
        if(l>=r) return;
        //生成[l,r]之间的随机索引
        int p=rnd.nextInt(r-l+1)+l;
        swap(arr,l,p);

        //arr[l+1...lt]<v;arr[lt+1...i-1]==v;arr[gt...r]>=v
        int lt=l,i=l+1,gt=r+1;
        while (i<gt){
            if(arr[i].compareTo(arr[l])<0){
                lt++;
                swap(arr,i,lt);
                i++;
            }else if(arr[i].compareTo(arr[l])>0){
                gt--;
                swap(arr,i,gt);
            }else {//arr[i]==arr[l]
                i++;
            }
        }
        swap(arr,l,lt);
        //arr[l...lt-1]<v;arr[lt...gt-1]==v;arr[gt...r]>=v
        sort2ways(arr,l,lt-1,rnd);
        sort2ways(arr,gt,r,rnd);
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
