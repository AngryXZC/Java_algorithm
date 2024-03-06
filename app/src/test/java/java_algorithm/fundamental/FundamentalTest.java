package java_algorithm.fundamental;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

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
}
