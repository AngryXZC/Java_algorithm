package imool_algorithm.sort;

import imook_algorithm.sort.SelectSort;
import imook_algorithm.sort.Student;
import org.junit.Test;

/**
 * @author xzc
 * @date 2024/3/4 23 01:03
 * @description
 */
public class TestSort {
    @Test
    public void testSelectSort(){
        Integer[] arr = {10,9,8,7,6,5,4,3,2,1};
        SelectSort.selectSort(arr);
        for(int i = 0 ; i < arr.length ; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    @Test
    public void testSelectStudentSort(){
        Student[] students = {new Student("Alice",98),
                new Student("Bobo",100),
                new Student("Charles",66)};
        SelectSort.selectSort(students);
        for(int i = 0 ; i < students.length ; i ++)
            System.out.print(students[i] + " ");
        System.out.println();
    }
}
