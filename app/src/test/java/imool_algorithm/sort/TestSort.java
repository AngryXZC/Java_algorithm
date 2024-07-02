package imool_algorithm.sort;

import imook_algorithm.foundation.ArrayGenerator;
import imook_algorithm.foundation.LinearSearch;
import imook_algorithm.foundation.SortingHelper;
import imook_algorithm.sort.SelectionSort;
import imook_algorithm.sort.Student;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author xzc
 * @date 2024/3/4 23 01:03
 * @description
 */
public class TestSort {
    //线性查找测试
    @Test
    public void linearSearch() {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        int res = LinearSearch.search(data, 16);
        System.out.println(res);

        int res2 = LinearSearch.search(data, 666);
        System.out.println(res2);


        imook_algorithm.foundation.Student[] students = {new imook_algorithm.foundation.Student("Alice"),
                new imook_algorithm.foundation.Student("Bobo"),
                new imook_algorithm.foundation.Student("Charles")};
        imook_algorithm.foundation.Student bobo = new imook_algorithm.foundation.Student("Bobo");
        int res3 = LinearSearch.search(students, bobo);
        System.out.println(res3);

    }
    @Test
    public void testExecuteTime(){
//        int n = 10000;
//        Integer[] data = ArrayGenerator.generateOrderedArray(n);
//
//        long start = System.currentTimeMillis();
//        for (int k = 0; k < 100; k++)
//            LinearSearch.search(data, n);
//        long time = System.currentTimeMillis() - start;
//        System.out.println("n = " + n + " , 100 runs : " + time + "ms");

        int[] dataSize = {1000000, 10000000};
        for(int n: dataSize) {
            Integer[] data = ArrayGenerator.generateOrderedArray(n);

            long startTime = System.nanoTime();
            for (int k = 0; k < 100; k++)
                LinearSearch.search(data, n);
            long endTime = System.nanoTime();

            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("n = " + n + ", 100 runs : " + time + "s");
        }

    }
    //测试随机数组的插入排序
    @Test
    public void testInsertionSort(){
        int[] dataSize = {10000, 100000};
        for(int n: dataSize) {
            Integer[] data = ArrayGenerator.generateRandomArray(n, n);
            Integer[] data2= Arrays.copyOf(data,data.length);
            long startTime = System.nanoTime();
            SelectionSort.sort(data);
            long endTime = System.nanoTime();

            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("Random Array, n = " + n + " : " + time + "s");
        }
    }
    //插入排序改为赋值后的优化（常数级别的优化）
    @Test
    public void insertionSort(){
        int[] dataSize = {10000, 100000};
        for(int n: dataSize) {
            Integer[] data = ArrayGenerator.generateRandomArray(n, n);
            Integer[] data2= Arrays.copyOf(data,data.length);
            SortingHelper.sortTest("InsertionSort",data);
            SortingHelper.sortTest("InsertionSort2",data2);
        }
    }
    @Test
    public void testSelectSort(){
        Integer[] arr = ArrayGenerator.generateRandomArray(10, 10);
        SortingHelper.sortTest("SelectionSort",arr);
        for(int i = 0 ; i < arr.length ; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    @Test
    public void testSelectStudentSort(){
        Student[] students = {new Student("Alice",98),
                new Student("Bobo",100),
                new Student("Charles",66)};
        SelectionSort.sort(students);
        for(int i = 0 ; i < students.length ; i ++)
            System.out.print(students[i] + " ");
        System.out.println();
    }
    //插入排序和选择排序对比
    @Test
    public void testSort(){
        int[] dataSize = {10000, 100000};
        for(int n: dataSize) {
            //生成一个长度为n的随机数组
            System.out.println("Random Array, size = " + n + " : ");
            Integer[] data = ArrayGenerator.generateRandomArray(n, n);
            Integer[] data2= Arrays.copyOf(data,data.length);
            SortingHelper.sortTest("SelectionSort",data);
            SortingHelper.sortTest("InsertionSort2",data2);
            //生成一个长度为n的顺序数组
            System.out.println("Ordered Array, size = " + n + " : ");
            data = ArrayGenerator.generateOrderedArray(n);
            data2= Arrays.copyOf(data,data.length);
            SortingHelper.sortTest("SelectionSort",data);
            SortingHelper.sortTest("InsertionSort2",data2);
        }
    }


 //测试归并排序
 @Test
 public  void testMergerSort()
 {
     int n=8;
     Integer[] arr=ArrayGenerator.generateRandomArray(n,n);
     SortingHelper.sortTest("MergeSort",arr);
 }
}
