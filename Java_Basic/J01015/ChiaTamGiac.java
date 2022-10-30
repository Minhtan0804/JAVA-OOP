package Java_Basic.J01015;

import java.util.Scanner;

public class ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            double n = sc.nextDouble(), h = sc.nextDouble();
            for (int i = 1; i < n; i++)
                System.out.printf("%.6f ", h * Math.sqrt(i/n));
            System.out.println();
        }
    }
}
