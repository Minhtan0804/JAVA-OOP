package Array.J02008;

import java.util.Scanner;

public class BoiSoNhoNhatCuaNSoNguyenDuongDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            long lcm = 1;
            for (int i = 1; i <= n; i++) {
                lcm = lcm / gcd(lcm, i) * i;
            }
            System.out.println(lcm);
        }
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
    }
}
