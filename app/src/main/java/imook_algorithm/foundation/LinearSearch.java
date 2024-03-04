package imook_algorithm.foundation;

/**
 * @author xzc
 * @date 2024/3/4 20 23:05
 * @description
 */
public class LinearSearch {

    private LinearSearch(){}

    public static <E> int search(E[] data, E target){

        for(int i = 0; i < data.length; i ++)
            if(data[i].equals(target))
                return i;
        return -1;
    }

}
