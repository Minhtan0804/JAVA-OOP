package Array.J02026;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] index = new int[20];
    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Arrays.fill(index, 0);
            int n = sc.nextInt();
            k = sc.nextInt();
            int[] arr = new int[n +1];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            Try(1, n, arr);
        }
    }

    private static void Try(int i, int n, int[] arr) {
        for (int j = index[i-1] + 1; j <= n - k + i; j++) {
            index[i] = j;
            if (i == k) {
                Print(arr);
            }
            else
                Try(i+1, n, arr);
        }
    }

    private static void Print(int[] arr) {
        for (int i = 1; i <= k; i++) {
            System.out.print(arr[index[i]] + " ");
        }
        System.out.println();
    }
}
