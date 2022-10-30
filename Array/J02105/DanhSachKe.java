package Array.J02105;

import java.util.Scanner;

public class DanhSachKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.printf("List(" + i + ") = ");;
            for (int j = 1; j <= n; j++) {
                if (matrix[i][j] == 1)
                    System.out.printf(j + " ");
            }
            System.out.println();
        }
    }
}
