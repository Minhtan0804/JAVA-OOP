package Array.J02010;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int test = 1;
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Buoc " + test++ + ": ");
            for (int j = i+1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
