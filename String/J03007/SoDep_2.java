package String.J03007;

import java.util.Scanner;

public class SoDep_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while (t-- > 0) {
            String num = sc.nextLine();
            niceNumber(num);
        }
    }

    static void niceNumber(String num) {
        int i = 0, j = num.length() - 1;
        int sum = 0;
        if (num.charAt(j) != '8') {
            System.out.println("NO");
            return;
        }


        while (i <= j) {
            int x = (int) num.charAt(i) - (int) '0';
            int y = (int) num.charAt(j) - (int) '0';
            if (x != y) {
                System.out.println("NO");
                return;
            }

            i++;
            j--;

            sum += x + y;
            if (i == j) sum -= x;
        }
        if (sum % 10 != 0) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
