package String.J03006;

import java.util.Scanner;

public class SoDep_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while (t-- > 0) {
            String num = sc.nextLine();
            niceNumber(num);
        }
    }

    static void niceNumber(String num) {
        int i = 0, j = num.length()-1;

        while (i <= j) {
            int x = (int)num.charAt(i);
            int y = (int)num.charAt(j);
            if (x != y) {
                System.out.println("NO");
                return;
            }

            if (x % 2 != 0) {
                System.out.println("NO");
                return;
            }
            i++; j--;
        }
        System.out.println("YES");
    }
}
