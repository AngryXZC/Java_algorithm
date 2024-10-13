package imook_algorithm.search;

/**
 * @author xzc
 * @date 2024/8/19 21 20:34
 * @description 改变循环不变量之后的结果
 */

public class Solution {
    public static <E extends Comparable<E>> int search(E[] data,E target){
        int l=0,r=data.length;
        //在data[l,r)中查找target
        while(l<r){
            int mid=l+(r-l)/2;
            if(data[mid].compareTo(target)==0){
                return mid;
            }
            if(data[mid].compareTo(target)<0){
                l=mid+1; //在data[mid+1,r)中查找target
            }else{
                r=mid; //在data[l,mid)中查找target
            }
        }
        return -1;
    }
}
