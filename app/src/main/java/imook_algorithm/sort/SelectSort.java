package imook_algorithm.sort;


/**
 * @author xzc
 * @date 2024/3/4 22 54:03
 * @description 选择排序
 */
public class SelectSort {
    private SelectSort(){}
    public static  <E extends Comparable<E>>void sort(E[] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[i])<0){
                    minIndex=j;
                }
            }
//            if(minIndex==i){
//                continue;
//            }
//            arr[i]=arr[minIndex]+arr[i];
//            arr[minIndex]=arr[i]-arr[minIndex];
//            arr[i]=arr[i]-arr[minIndex];
            swap(arr,i,minIndex);
        }
    }

    private static <E>void swap(E[] arr, int i, int minIndex) {
        E t=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=t;
    }
}
