package imool_algorithm.sort.arry_test;

import imook_algorithm.data_structure.Array;
import org.junit.Test;

/**
 * @author xzc
 * @date 2024/3/21 16 12:44
 * @description
 */
public class ArrayTest {
    @Test
    public void testArray(){
        Array<Integer> arr = new Array<>();
        for(int i = 0 ; i < 10 ; i ++)
            arr.addLast(i);
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);
        // [-1, 0, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);
    }
}
