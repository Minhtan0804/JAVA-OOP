package Java_Basic.J01021;

import java.util.Scanner;

public class TinhLuyThua {
    static long mod = (long)1e9+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) break;

            if (a == 1) System.out.println(1);
            else System.out.println(powerMod(a, b));;
        }
    }

    public static long powerMod(long a, long b) {
        if (b == 0) return 1;

        long x = powerMod(a, b/2);
        if (b % 2 == 0) return x * x % mod;
        else return a *(x * x % mod) % mod;
    }
}
