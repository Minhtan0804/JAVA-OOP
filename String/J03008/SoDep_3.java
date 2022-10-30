package String.J03008;

import java.util.Scanner;

public class SoDep_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String num = sc.nextLine();
            niceNumber(num);
        }
    }

    static boolean isPrime(int j) {
        if (j == 2 || j == 3 || j == 5 || j == 7)
            return true;

        return false;
    }

    static void niceNumber(String num) {
        int i = 0, j = num.length() - 1;

        while (i <= j) {
            int x = (int) num.charAt(i) - (int) '0';
            int y = (int) num.charAt(j) - (int) '0';
            if (x != y || isPrime(x) == false) {
                System.out.println("NO");
                return;
            }
//            else if (isPrime(x) == false) {
//                System.out.println("NO");
//                return;
//            }

            i++;
            j--;

        }

        System.out.println("YES");
    }
}
