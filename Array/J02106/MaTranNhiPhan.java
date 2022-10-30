package Array.J02106;

import java.util.Scanner;

public class MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n+1][4];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= 3; j++) {
                if (matrix[i][j] == 1)
                    cnt++;
            }
            if (cnt >= 2)
                count++;
        }

        System.out.println(count);
    }
}
