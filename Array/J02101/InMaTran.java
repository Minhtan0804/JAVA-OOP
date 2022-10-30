package Array.J02101;

import java.util.Scanner;

public class InMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            boolean leftToRight = true;
            for (int i = 0; i < n; i++) {
                if (leftToRight) {
                    for (int j = 0; j < n; j++) {
                        System.out.printf("%d ", matrix[i][j]);
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        System.out.printf("%d ", matrix[i][j]);
                    }
                }

                leftToRight = !leftToRight;
            }
            System.out.println();
        }
    }
}
