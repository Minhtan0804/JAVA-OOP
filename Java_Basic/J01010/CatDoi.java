package Java_Basic.J01010;

import java.util.Scanner;

public class CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            cat(n);
        }
    }

    public static void cat(long n) {
        long res = 0, i = 0;
        while (n > 0) {
            long k = n % 10;
            n /= 10;
            if (k != 0 && k != 1 && k != 8 && k != 9) {
                System.out.println("INVALID");
                return;
            }
            if (k == 1) {
                res += Math.pow(10, i);
            }
            i++;
        }
        if (res == 0) {
            System.out.println("INVALID");
            return;
        }

        System.out.println(res);
    }
}
