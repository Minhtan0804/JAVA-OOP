package Class_and_Object.J04016;

import java.util.*;

public class Matrix {
    private int[][] arr;
    private int n;
    private int m;

    public Matrix(int n, int m) {
        this.arr = new int[n][m];
        this.n = n;
        this.m = m;
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
    }

    public Matrix mul(Matrix o) {
        Matrix res = new Matrix(n, o.m);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < o.m; j++)
                for (int k = 0; k < m ; k++)
                    res.arr[i][j] += arr[i][k] * o.arr[k][j];

        return res;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                result.append(arr[i][j]).append(" ");
            result.append("\n");
        }
        return result.toString();
    }
}
