package Array.J02020;

import java.util.Scanner;

public class LietKeToHop_1 {
    static int[] a = new int[15];
    static int n;
    static int k;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        tryy(1);
        System.out.println("Tong cong co " + count + " to hop");
    }

    public static void tryy(int i) {
        for (int j = a[i-1]+1; j <= n; j++) {
            a[i] = j;
            if (i == k) {
                count++;
                for (int t = 1; t <= k; t++) {
                    System.out.print(a[t]);
                }
                System.out.print(" ");
            } else {
                tryy(i+1);
            }
        }
    }
}
