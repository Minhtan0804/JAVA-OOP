package Array.J02024;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int[] index = new int[20];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());
//            System.out.println(Arrays.toString(arr));
            Try(0, n, arr);
        }
    }

    private static void Try(int i, int n, Integer[] arr) {
        for (int j = 0; j <= 1; j++) {
            index[i] = j;
            if (i == n - 1) {
                if (check(n, arr))
                    Print(n, arr);
            } else
                Try(i+1, n, arr);
        }

    }

    private static void Print(int n, Integer[] arr) {
        for (int i = 0; i < n ; i++) {
            if (index[i] == 1)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static boolean check(int n, Integer[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i] * index[i];
        }
        return sum % 2 != 0;
    }
}
