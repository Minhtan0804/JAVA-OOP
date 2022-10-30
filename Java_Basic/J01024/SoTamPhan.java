package Java_Basic.J01024;

import java.util.Scanner;

public class SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            solve(str);
        }
    }

    public static void solve(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '2') {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
