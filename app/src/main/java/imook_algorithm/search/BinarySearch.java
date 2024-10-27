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

    //>target的最小索引值
    public static <E extends Comparable<E>> int upper(E[] data, E target){
        int l=0,r= data.length;
        //在data[l,r]中寻找解
        while (l<r){
            int mid =l+(r-l)/2;
            if(data[mid].compareTo(target)<0)
                l=mid+1;
            else
                r=mid;
        }
        return l;
    }

    //> target,返回大于target的最小值索引
    //== target,返回target的最大索引
    public static <E  extends Comparable<E>>  int  ceil(E[] data,E target){
        int u=upper(data,target);
        if(data[u-1].compareTo(target)==0)
            return u-1;
        return u;
    }

    // >= target 的最小值索引
    public static <E extends Comparable<E>> int lower_ceil(E[] data, E target){

        int l = 0, r = data.length;

        // 在 data[l, r] 中寻找解
        while(l < r){

            int mid = l + (r - l) / 2;

            // 在 upper 中，这里是 data[mid].compareTo(target) <= 0
            // 但是，对于 lower_ceil 来说，在 data[mid] == target 的时候，有可能是解
            // 所以在等于的情况下，不能排除掉 data[mid] 的值。在等于的情况下，应该归入下面的 else 中做处理
            // 也就是，data[mid] == target 的时候可能是解，也可能有更小的解在左边，应该去更新右边界
            if(data[mid].compareTo(target) < 0)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    //lower 变种



    public static void main(String[] args) {

        Integer[] arr={1,2,3,3,5,5};

     for (int i = 0; i <=6 ; i++)
//         System.out.print(BinarySearch.upper(arr,i)+" ");

         System.out.print(BinarySearch.upper(arr,i)+" ");

     System.out.println();



    }
}
