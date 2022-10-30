package String.J03024;

import java.util.Scanner;

public class SoUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());

        while (t-- > 0) {
            String num = sc.nextLine();
            advantageNum(num);
        }
    }

    static void advantageNum(String num) {
        int even = 0, odd = 0;
        if (num.charAt(0) == '0') {
            System.out.println("INVALID");
            return;
        }
        for (int i = 0; i < num.length(); i++) {
            if (Character.isDigit(num.charAt(i)) == false) {
                System.out.println("INVALID");
                return;
            }

            int temp = Character.getNumericValue(num.charAt(i));

            if (temp % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if ((num.length() % 2 == 0 && even > odd) ||
                (num.length() % 2 != 0 && even < odd)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
