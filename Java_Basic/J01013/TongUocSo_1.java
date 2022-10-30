package Java_Basic.J01013;

import java.util.Scanner;

public class TongUocSo_1 {
    public static void main(String[] args) {
        int[] a = new int[2000005];
        a[0] = a[1] = 1;
        for (int i = 2; i <= 1420; i++) {
            if (a[i] == 0) {
                for (int j = i * i; j <= 2000000; j += i) {
                    if (a[j] == 0) a[j] = i;
                }
            }
        }

        for (int i = 2; i <= 2000000 ; i++) {
            if (a[i] == 0) {
                a[i] = i;
            }
        }

        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();

            while (x > 1) {
                sum += a[x];
                x /= a[x];
            }
        }
        System.out.println(sum);
    }
}
