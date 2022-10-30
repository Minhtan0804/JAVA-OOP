package Java_Basic.J01006;

import java.util.Scanner;

public class TinhSoFibo {
    static long[] fibo = new long[93];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Fibo();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(fibo[n]);
        }
    }

    public static void Fibo(){
        fibo[1] = 1; fibo[2] = 1;
        for (int i = 2; i < 93; i++)
            fibo[i] = fibo[i-1] + fibo[i-2];
    }
}
