package Array.J02011;

import java.util.Scanner;

public class SapXepChon {
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
            int min = a[i], min_index = i;
            for (int j = i+1; j < n; j++) {
                if (min > a[j]) {
                    min = a[j];
                    min_index = j;
                }
            }
            if (a[i] > min) {
                int temp = a[i];
                a[i] = a[min_index];
                a[min_index] = temp;
            }
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
