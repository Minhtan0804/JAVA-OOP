package Java_Basic.J01011;

import java.util.Scanner;

public class BoiSoChung_UocSoChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(a * b / gcd(a, b) + " " + gcd(a, b));
        }
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
