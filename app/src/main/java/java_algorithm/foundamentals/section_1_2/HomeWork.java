import edu.princeton.cs.algs4.StdOut;

/**
 * @author xzc
 * @date 2024/7/9 10 29:56
 * @description
 */
public class HomeWork {

    private static  void p_1_2_4(){
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
    }
    private static void p_1_2_5(){
        String s = "Hello World";
        s.toUpperCase();
        s.substring(6, 11);
        StdOut.println(s);
    }
    /**
     * 如果字符串 s 中的字符循环移动任意位置之后能够得到另一个字符串 t，
     * 那么 s 就被称为 t 的回环变位（circular rotation）。
     * 例如，ACTGACG 就是 TGACGAC 的一个回环变位，
     * 反之亦然。判定这个条件在基因组序列的研究中是很重要的。
     * 编写一个程序检查两个给定的字符串 s 和 t 是否互为回环变位。
     * 提示：答案只需要一行用到 indexOf()、length() 和字符串连接的代码。
     * */
    private static void p_1_2_6(){
        String s = "ACTGACG";
        String t = "TGACGAC";
        StdOut.println(s.length() == t.length() && (s + s).indexOf(t) >= 0);
    }

    public static String mystery(String s)
    {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }
    public static void main(String[] args) {
        StdOut.print(mystery("12345"));
    }
}
