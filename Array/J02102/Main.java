package Array.J02102;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temp = new int[n * n];
        for (int i = 0; i < n * n; i++)
            temp[i] = sc.nextInt();

        Arrays.sort(temp);

        int[][] arr = new int[n+1][n+1];

        int k = 0;
        int l = n - 1;
        int count = 0;

        while (count < n * n - 1) {
            for (int i = k; i < l; i++) {
                arr[k][i] = temp[count++];
            }

            for (int i = k; i < l; i++) {
                arr[i][l] = temp[count++];
            }

            for (int i = l; i > k; i--) {
                arr[l][i] = temp[count++];
            }

            for (int i = l; i > k; i--) {
                arr[i][k] = temp[count++];
            }

            k++;
            l--;
        }

        if (n % 2 != 0)
            arr[n/2][n/2] = temp[count];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
