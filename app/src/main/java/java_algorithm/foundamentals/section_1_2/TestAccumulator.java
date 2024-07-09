
import edu.princeton.cs.algs4.*;

/**
 * @author xzc
 * @date 2024/7/8 20 22:12
 * @description
 */
public class TestAccumulator
{
    public static void main(String[] args)
    {
        int T = Integer.parseInt(args[0]);
        Accumulator a = new Accumulator();
        for (int t = 0; t < T; t++)
            a.addDataValue(StdRandom.random());
        StdOut.println(a);
    }
}
