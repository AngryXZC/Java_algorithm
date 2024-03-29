package java_algorithm.foundamentals.section_1_1;//package java_algorithm.foundamentals;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author xzc
 * @date 2024/3/5 15 49:42
 * @description
 */
public class RandomSeq {
    public static void main(String[] args)
    {  // 打印N个(lo, hi)之间的随机值
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for (int i = 0; i < N; i++)
        {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }

}
