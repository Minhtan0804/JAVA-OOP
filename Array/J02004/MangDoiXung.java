package Array.J02004;

import java.util.Scanner;

public class MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ((t--) > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            arraySym(a, n);
        }
    }

    public static void arraySym(int a[], int n) {
        int i = 0, j = n-1;
        while (i <= j) {
            if (a[i] != a[j]) {
                System.out.println("NO");
                return;
            }
            i++; j--;
        }
        System.out.println("YES");
    }
}
