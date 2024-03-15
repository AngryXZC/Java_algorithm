package java_algorithm.exercises.chaepter01.section01;

/**
 * @author xzc
 * @date 2024/3/15 16 49:25
 * @description 矩阵类
 * 实现向量点乘
 * 矩阵和矩阵之积
 * 转置矩阵
 * 矩阵和向量之积
 * 向量和矩阵之积
 */
public class Matrix {
    //实现向量点乘
    public static double dot(double[] x, double[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("向量长度不一致");
        }
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i] * y[i];
        }
        return sum;
    }
    //矩阵和矩阵之积
    public static double[][] mult(double[][] a, double[][] b) {
        if (a[0].length != b.length) {
            throw new IllegalArgumentException("矩阵a的列数不等于矩阵b的行数");
        }
        double[][] result = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
    //转置矩阵
    public static double[][] transpose(double[][] a) {
        double[][] result = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[j][i] = a[i][j];
            }
        }
        return result;
    }
    //矩阵和向量之积
    public static double[] mult(double[][] a, double[] x) {
        if (a[0].length != x.length) {
            throw new IllegalArgumentException("矩阵a的列数不等于向量x的长度");
        }
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < x.length; j++) {
                result[i] += a[i][j] * x[j];
            }
        }
        return result;
    }
    //向量和矩阵之积
    public static double[] mult(double[] y, double[][] a) {
        if (y.length != a.length) {
            throw new IllegalArgumentException("向量y的长度不等于矩阵a的行数");
        }
        double[] result = new double[a[0].length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < y.length; j++) {
                result[i] += y[j] * a[j][i];
            }
        }
        return result;
    }
}
