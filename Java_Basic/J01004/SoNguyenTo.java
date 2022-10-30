package Java_Basic.J01004;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            if  (isPrime(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isPrime(long n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
