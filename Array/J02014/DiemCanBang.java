package Array.J02014;

import java.util.Scanner;

public class DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), sum = 0;
            int[] a = new int[n+1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            int temp = 0;
            boolean done = false;
            for (int i = 1; i <= n; i++) {
                temp += a[i-1];
                sum -= a[i];
                if (sum == temp) {
                    System.out.println(i);
                    done = true;
                    break;
                }
            }
             if (done == false) {
                 System.out.println("-1");
             }
        }
    }
}
