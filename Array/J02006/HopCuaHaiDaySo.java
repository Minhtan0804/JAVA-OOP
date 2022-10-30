package Array.J02006;

import java.util.Scanner;

public class HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new  int[n];
        int[] b = new  int[m];
        int[] c = new  int[1000];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            c[a[i]]++;
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            c[b[i]]++;
        }

        for (int i = 0; i < 1000; i++) {
            if (c[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }
}
