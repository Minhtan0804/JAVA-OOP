package Array.J02034;

import java.util.Scanner;

public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (n == a[n-1]) {
            System.out.println("Excellent!");
            return;
        }

        int temp = 0;
        while (temp < a[0]-1) {
            System.out.println(++temp);
        }

        for (int i = 1; i < n; i++) {
            temp = a[i-1];
            while(a[i] - temp > 1) {
                System.out.println(++temp);
            }
        }
    }
}
