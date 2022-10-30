package String.J03025;

import java.util.Scanner;

public class XauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            symmetryString(str);
        }
    }

    static void symmetryString(String str) {
        int i = 0, j = str.length() - 1;
        int count = 0;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                count++;
            }
            i++; j--;
        }

        if (count > 1 || (count == 0 && str.length() % 2 == 0)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
