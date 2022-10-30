package Java_Basic.J01008;

import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while(t-- > 0) {
            int n = sc.nextInt();
            System.out.print("Test " + test + ": ");
            for (int i = 2; i <= Math.sqrt(n); i++) {
                int count = 0;
                while(n % i == 0) {
                    count++;
                    n /= i;
                }
                if (count > 0)
                    System.out.print(i + "(" + count + ") ");
            }
            if (n != 1)
                System.out.print(n + "(1)");
            test++;
            System.out.println();
        }
    }
}
