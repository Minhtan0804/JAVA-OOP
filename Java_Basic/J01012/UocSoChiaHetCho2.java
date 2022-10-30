package Java_Basic.J01012;

import java.util.Scanner;

public class UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i % 2 == 0)
                        count++;
                    if (n/i % 2 == 0  && n/i != i)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
