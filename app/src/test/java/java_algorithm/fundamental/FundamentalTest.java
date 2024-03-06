package java_algorithm.fundamental;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

import java.util.Scanner;

public class FundamentalTest {
    @Test
    public void test() {
        System.out.println("Hello, World!");
    }

    //1.1.1　给出以下表达式的值：
    //
    //　　　a. ( 0 + 15 ) / 2
    //
    //　　　b. 2.0e-6 * 100000000.1
    //
    //　　　c. true && false || true && true
    @Test
    public void test1_1_1() {
        System.out.println((0 + 15) / 2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
    }

    //1.1.2　给出以下表达式的类型和值：
    //
    //　　　a. (1 + 2.236)/2
    //
    //　　　b. 1 + 2 + 3 + 4.0
    //
    //　　　c. 4.1 >= 4
    //
    //　　　d. 1 + 2 + "3"
    @Test
    public void test1_1_2() {
        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + 3 + 4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1 + 2 + "3");
    }

    //1.1.3　编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印equal，否则打印not equal。
    @Test
    public void test1_1_3() {
        int a = 1;
        int b = 2;
        int c = 3;
        if (a == b && b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    //1.1.4　编写一个程序，打印出一个N×N的乘法表。
    @Test
    public void test1_1_4() {
        int N = 10;
        int[][] a = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = i * j;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //1.1.5　编写一段程序，如果double类型的变量x和y都严格位于0和1之间则打印true，否则打印false。
    @Test
    public void test1_1_5() {
        double x = 0.5;
        double y = 0.6;
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //1.1.6　下面这段程序会打印出什么？
    @Test
    public void test1_1_6() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    //1.1.7　分别给出以下代码段打印出的值：
    //
    //　　　a. double t = 9.0;
    //　　　　　while (Math.abs(t - 9.0/t) > .001)
    //　　　　　　t = (9.0/t + t) / 2.0;
    //　　　StdOut.printf("%.5f\n", t);
    //
    //　　　b. int sum = 0;
    //　　　　　for (int i = 1; i < 1000; i++)
    //　　　　　　for (int j = 0; j < i; j++)
    //　　　　　　sum++;
    //　　　StdOut.println(sum);
    //
    //　　　c. int sum = 0;
    //　　　　　for (int i = 1; i < 1000; i *= 2)
    //　　　　　　for (int j = 0; j < 1000; j++)
    //　　　　　　sum++;
    //　　　StdOut.println(sum);
    @Test
    public void test1_1_7() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
        sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    //1.1.8　下列语句会打印出什么结果？给出解释。
    //
    //　　　a. System.out.println('b');
    //
    //　　　b. System.out.println('b' + 'c');
    //
    //　　　c. System.out.println((char) ('a' + 4));
    @Test
    public void test1_1_8() {
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
    }

    //1.1.9　编写一段代码，将一个正整数N用二进制表示并转换为一个String类型的值s。
    @Test
    public void test1_1_9() {
        int N = 10;
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        System.out.println(s);
    }
    //1.1.10　下面这段代码有什么错误？
    //
    //　　　int[] a;
    //　　　for (int i = 0; i < 10; i++)
    //　　　　a[i] = i * i;
    //解答：没有初始化a。

    //1.1.11　编写一段代码，打印出一个二维布尔数组的内容。其中，使用*表示真，空格表示假。打印出行号和列号。
    @Test
    public void test1_1_11() {
        boolean[][] a = {{true, false, true}, {false, true, false}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //1.1.12　以下代码段会打印出什么结果？
    //
    //　　　int[] a = new int[10];
    //　　　for (int i = 0; i < 10; i++)
    //　　　　a[i] = 9 - i;
    //　　　for (int i = 0; i < 10; i++)
    //　　　　a[i] = a[a[i]];
    //　　　for (int i = 0; i < 10; i++)
    //　　　　System.out.println(i);
    @Test
    public void test1_1_12() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    //1.1.13　编写一段代码，打印出一个M行N列的二维数组的转置（交换行和列）。
    @Test
    public void test1_1_13() {
        int M = 2;
        int N = 3;
        int[][] a = new int[M][N];
        int[][] b = new int[N][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = i * j;
                b[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    //1.1.14　编写一个静态方法lg()，接受一个整型参数N，返回不大于log2N的最大整数。不要使用Math库。
    @Test
    public void test1_1_14() {
        int N = 10;
        int lg = 0;
        for (int i = N; i > 0; i /= 2) {
            lg++;
        }
        System.out.println(lg - 1);
    }

    //1.1.15　编写一个静态方法histogram()，
    // 接受一个整型数组a[]和一个整数M为参数并返回一个大小为M的数组，
    // 其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0到M-1之间，返回数组中所有元素之和应该和a.length相等。
    @Test
    public void test1_1_15() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int M = 10;
        int[] b = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < M) {
                b[a[i]]++;
            }
        }
        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }

    //1.1.16　给出 exR1(6) 的返回值：
    //
    //　　　public static String exR1(int n)
    //　　　{
    //　　　　if (n <= 0) return "";
    //　　　　return exR1(n-3) + n + exR1(n-2) + n;
    //　　　}
    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    @Test
    public void test1_1_16() {
        System.out.println(exR1(6));
    }
    //1.1.17　找出以下递归函数的问题：
    //
    //
    //public static String exR2(int n)
    //{
    //   String s = exR2(n-3) + n + exR2(n-2) + n;
    //   if (n <= 0) return "";
    //   return s;
    //}
    //解答：在n<=0时，递归调用会导致栈溢出。

    //1.1.18　请看以下递归函数：
    //
    //　　　public static int mystery(int a, int b)
    //　　　{
    //　　　　if (b == 0) return 0;
    //　　　　if (b % 2 == 0) return mystery(a+a, b/2);
    //　　　　return mystery(a+a, b/2) + a;
    //　　　}
    //mystery(2, 25) 和 mystery(3, 11) 的返回值是多少？
    // 给定正整数a和b，mystery(a, b)计算的结果是什么？
    // 将代码中的+替换为*并将return 0改为return 1，然后回答相同的问题。
    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    @Test
    public void test1_1_18() {
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));
    }
    // 解答：mystery(2, 25) = 50, mystery(3, 11) = 33。
    // mystery(a, b)计算的结果是a*b。
    // 将代码中的+替换为*并将return 0改为return 1，mystery(a, b)计算的结果是2^b。

    //1.1.9 在计算机上运行以下程序：
    //public class Fibonacci
    //{
    //   public static long F(int N)
    //   {
    //      if (N == 0) return 0;
    //      if (N == 1) return 1;
    //      return F(N-1) + F(N-2);
    //   }
    //   public static void main(String[] args)
    //   {
    //      for (int N = 0; N < 100; N++)
    //         StdOut.println(N + " " + F(N));
    //   }
    //}
    //　　　计算机用这段程序在一个小时之内能够得到 F(N) 结果的最大 N 值是多少？
    //     开发 F(N) 的一个更好的实现，用数组保存已经计算过的值。
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    @Test
    public void test1_1_19() {
        for (int N = 0; N < 100; N++) {
            System.out.println(N + " " + F(N));
        }
    }

    // 解答：计算机用这段程序在一个小时之内能够得到 F(N) 结果的最大 N 值是40。
    // 开发 F(N) 的一个更好的实现，用数组保存已经计算过的值。
    public static long[] F1(int N) {
        long[] f = new long[N];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < N; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }

    @Test
    public void test1_1_19_1() {
        long[] f = F1(100);
        for (int i = 0; i < f.length; i++) {
            System.out.println(i + " " + f[i]);
        }
    }

    //1.1.20　编写一个递归的静态方法计算ln(N!)的值。
    public static long ln(int N) {
        if (N == 1) return 0;
        //这里使用对数运算法则ln(a*b)=ln(a)+ln(b)
        return (long) (ln(N - 1) + Math.log(N));
    }

    @Test
    public void test1_1_20() {
        System.out.println(ln(10));
    }

    //1.1.21　编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。
    // 然后用 printf() 打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数除以第二个整数的结果，精确到小数点后三位。
    // 可以用这种程序将棒球球手的击球命中率或者学生的考试分数制成表格。
    //这里使用StdIn和StdOut
    @Test
    public void test1_1_21() {
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            StdOut.printf("%s %d %d %.3f\n", name, a, b, (double) a / b);
        }
    }

    //1.1.22　使用 1.1.6.4 节中的 rank() 递归方法重新实现 BinarySearch 并跟踪该方法的调用。
    // 每当该方法被调用时，打印出它的参数 lo 和 hi 并按照递归的深度缩进。
    // 提示：为递归方法添加一个参数来保存递归的深度。
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    private static int rank(int key, int[] a, int lo, int hi, int depth) {
        // Print the arguments and indent according to the depth
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.println("lo = " + lo + ", hi = " + hi);

        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, depth + 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth + 1);
        else return mid;
    }

    @Test
    public void test1_1_22() {
        //定义一个很长的有序数组
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i;
        }
        System.out.println(rank(50, a));
    }

    //1.1.23　为 BinarySearch 的测试用例添加一个参数：+ 表示打印出标准输入中不在白名单上的值，
    // - 表示打印出标准输入中在白名单上的值。
    //见文件
    //1.1.24　给出使用欧几里得算法计算105 和 24 的最大公约数的过程中得到的一系列 p 和 q 的值。
    // 扩展该算法中的代码得到一个程序 Euclid，
    // 从命令行接受两个参数，计算它们的最大公约数并打印出每次调用递归方法时的两个参数。
    // 使用你的程序计算 1 111 111 和 1 234 567 的最大公约数。
    public static int Euclid(int p, int q) {
        System.out.println("p = " + p + ", q = " + q);
        if (q == 0) return p;
        int r = p % q;
        return Euclid(q, r);
    }

    @Test
    public void test1_1_24() {
        System.out.println(Euclid(105, 24));
        System.out.println(Euclid(1111111, 1234567));
    }
    //1.1.25 使用数学归纳法证明欧几里得算法能够计算任意一对非负整数 p 和 q 的最大公约数。
    //解答：证明略。
    //1.1.26　将三个数排序。假设 a、b、c 和 t 都是同一种原始数字类型的变量。
    // 证明以下代码能够将 a、b、c 按照升序排列：
    // if (a > b) { t = a; a = b; b = t; }
    // if (a > c) { t = a; a = c; c = t; }
    // if (b > c) { t = b; b = c; c = t; }
    //解答：略。

    //1.1.27　二项分布。估计用以下代码计算 binomial(100, 50, 0.25) 将会产生的递归调用次数：
    //public static double binomial(int N, int k, double p)
    //{
    //   if ((N == 0) || (k < 0)) return 1.0;
    //   return (1.0 - p)*binomial(N-1, k) + p*binomial(N-1, k-1);
    //}
    //将已经计算过的值保存在数组中并给出一个更好的实现。
    public static double binomial(int N, int k, double p) {
        double[][] matrix = new double[N + 1][k + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                matrix[i][j] = -1;
            }
        }
        return binomial(N, k, p, matrix);
    }

    public static double binomial(int N, int k, double p, double[][] matrix) {
        if ((N == 0) || (k < 0)) return 1.0;
        if (matrix[N][k] == -1) {
            matrix[N][k] = (1.0 - p) * binomial(N - 1, k, p, matrix) + p * binomial(N - 1, k - 1, p, matrix);
        }
        return matrix[N][k];
    }

    @Test
    public void test1_1_27() {
        System.out.println(binomial(100, 50, 0.25));
    }

    //1.1.28　删除重复元素。修改 BinarySearch 类中的测试用例来删去排序之后白名单中的所有重复元素。
    //解答：见文件
    //1.1.29　等值键。为 BinarySearch 类添加一个静态方法 rank()，它接受一个键和一个整型有序数组（可能存在重复键）
    // 作为参数并返回数组中小于该键的元素数量，以及一个类似的方法 count() 来 返回数组中等于该键的元素的数量。
    // 注意：如果 i 和 j 分别是 rank(key, a) 和 count(key, a) 的返回值，那么 a[i..i+j-1] 就是数组中所有和 key 相等的元素。
    //解答：见文件
    //1.1.30　数组练习。编写一段代码，创建一个 N×N 的布尔数组 a[][]。其中当 i 和 j 互质时（没有相同的除数能够整除它们），
    // a[i][j] 为 true，否则为 false。
    @Test
    public void test1_1_30() {
        int N = 10;
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = isCoprime(i, j);
            }
        }
        //使用StdOut 输出数组
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j]) {
                    StdOut.print("T ");
                } else {
                    StdOut.print("F ");
                }
            }
            StdOut.println();
        }
    }

    private boolean isCoprime(int i, int j) {
        return gcd(i, j) == 1;
    }

    private int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    //1.1.31　随机连接。编写一段程序，从命令行接受一个整数 N 和 double 值 p（0 到 1 之间）作为参数，
    // 在一个圆上画出大小为 0.05 且间距相等的 N 个点，然后将每对点按照概率 p 用灰线连接。
    @Test
    public void test1_1_31() {
        int N = 10;
        double p = 0.5;
        double[][] a = new double[N][2];
        for (int i = 0; i < N; i++) {
            a[i][0] = Math.cos(2 * Math.PI * i / N);
            a[i][1] = Math.sin(2 * Math.PI * i / N);
        }
        StdDraw.setPenRadius(0.05);
        for (int i = 0; i < N; i++) {
            StdDraw.point(a[i][0], a[i][1]);
        }
        StdDraw.setPenRadius();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Math.random() < p) {
                    StdDraw.line(a[i][0], a[i][1], a[j][0], a[j][1]);
                }
            }
        }
    }

    //1.1.32　直方图。假设标准输入流中有一个含有 N 个 double 值的文件。编写一段程序，从命令行接受一个整数 M 和两个 double 值 l 和 r。
    // 将 (l，r) 分为 M 段并使用 StdDraw 画出输入流中的值落入每段的数量的直方图。
    @Test
    public void test1_1_32() {
        int M = 10;
        double l = 0.0;
        double r = 1.0;
        int[] a = new int[M];
        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            if (value >= l && value <= r) {
                int index = (int) (M * (value - l) / (r - l));
                if (index == M) index = M - 1;
                a[index]++;
            }
        }
        int max = a[0];
        for (int i = 1; i < M; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        StdDraw.setCanvasSize(1024, 512);
        StdDraw.setXscale(-1, M);
        StdDraw.setYscale(-1, max);
        StdDraw.setPenRadius(0.5 / M);
        for (int i = 0; i < M; i++) {
            double x = 1.0 * i;
            double y = a[i] / 2.0;
            double rw = 0.5 / M;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
    //剩下的再说吧
    // TODO
}
