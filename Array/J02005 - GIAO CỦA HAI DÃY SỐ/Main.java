package Array.J02005;

import java.util.Scanner;

public class GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new  int[n];
        int[] b = new  int[m];
        int[] c = new  int[1005];
        int[] d = new  int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            c[a[i]]++;
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            d[b[i]]++;
        }

        for (int i = 0; i <= 1000; i++) {
            if (c[i] > 0 && d[i] >= 1) {
                System.out.print(i + " ");
            }
        }
    }
}
