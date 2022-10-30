package Array.J02012;

import java.util.Scanner;

public class SapXepChen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Buoc 0: " +a[0]);
        int test = 1;
        for (int i = 1; i < n; i++) {
            System.out.print("Buoc " + test++ + ": ");
            int key = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
            for (int k = 0; k <= i; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
