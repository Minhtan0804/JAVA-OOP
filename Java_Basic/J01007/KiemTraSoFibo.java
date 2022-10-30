package Java_Basic.J01007;

import java.util.Scanner;

public class KiemTraSoFibo {
    static long[] fibo = new long[93];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Fibo();
        while (t-- > 0) {
            long n = sc.nextLong();
            for (int i = 1; i < 93; i++) {
                if (fibo[i] == n) {
                    System.out.println("YES");
                    break;
                } else if (fibo[i] > n) {
                    System.out.println("NO");
                    break;
                }
            }
        }
    }

    public static void Fibo(){
        fibo[1] = 0; fibo[2] = 1;
        for (int i = 3; i < 93; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
//            System.out.println(fibo[i]);
        }

    }
}
