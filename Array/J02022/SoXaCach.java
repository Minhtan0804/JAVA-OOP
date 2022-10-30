package Array.J02022;

import java.util.Scanner;

public class SoXaCach {
    static int[] a = new int[15];
    static boolean[] b = new boolean[15];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            tryy(1);
            System.out.println();
        }
    }

    public static boolean check() {
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - a[i+1]) == 1) {
                return false;
            }
        }
        return true;
    }

    public static void tryy(int i) {
        for (int j = 1; j <= n; j++) {
            if (b[j] == false) {
                a[i] = j;
                b[j] = true;
                if (i == n) {
                    if (check()) {
                        for (int t = 1; t <= n; t++) {
                            System.out.print(a[t]);
                        }
                        System.out.println();
                    }
                } else {
                    tryy(i + 1);
                }
                b[j] = false;
            }
        }
    }
}
