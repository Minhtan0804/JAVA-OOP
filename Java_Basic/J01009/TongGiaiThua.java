package Java_Basic.J01009;

import java.util.Scanner;

public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0, count = 1;
        for (int i = 1; i <= n; i++) {
            count *= i;
            sum += count;
        }
        System.out.println(sum);
    }
}
