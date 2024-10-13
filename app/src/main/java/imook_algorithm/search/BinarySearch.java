package imook_algorithm.search;

/**
 * @author xzc
 * @date 2024/8/19 20 13:07
 * @description 二分查找法
 */
public class BinarySearch {
    private BinarySearch(){}

    //递归实现
    public static <E extends Comparable<E>> int searchR(E[] data, E target){
        return searchR(data, target, 0, data.length-1);
    }
    private static <E extends Comparable<E>> int searchR(E[] data, E target, int l, int r){

        if(l>r){
            return -1;
        }
        int mid = l + (r-l)/2;
        if(data[mid].compareTo(target)==0){
            return mid;
        }
        if(data[mid].compareTo(target)<0){
            return searchR(data, target, mid+1, r);
        }
        return searchR(data, target, l, mid-1);
    }

    //非递归实现
    public static <E extends Comparable<E>> int search(E[] data,E target){
        int l=0,r=data.length-1;
        //在data[l,r]中查找target
        while(l<=r){
            int mid=l+(r-l)/2;
            if(data[mid].compareTo(target)==0){
                return mid;
            }
            if(data[mid].compareTo(target)<0){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;
    }
}
