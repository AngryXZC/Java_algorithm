package imool_algorithm.chapter01;

import imook_algorithm.foundation.ArrayGenerator;
import imook_algorithm.foundation.LinearSearch;
import imook_algorithm.foundation.Student;
import org.junit.Test;


/**
 * @author xzc
 * @date 2024/3/4 20 35:52
 * @description
 */
public class Test01 {
    //线性查找测试
    @Test
    public void linearSearch() {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        int res = LinearSearch.search(data, 16);
        System.out.println(res);

        int res2 = LinearSearch.search(data, 666);
        System.out.println(res2);


        Student[] students = {new Student("Alice"),
                new Student("Bobo"),
                new Student("Charles")};
        Student bobo = new Student("Bobo");
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

}
