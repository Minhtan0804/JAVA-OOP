package Array.J01018;

import java.util.Scanner;

public class SoKhongLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            if (solve(str)) System.out.println("YES");
            else System.out.println("NO");
        }

    }

    public static boolean solve(String str) {
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            temp += str.charAt(i) - '0';
        }
        if (temp % 10 != 0)
            return false;

        for (int i = 1; i < str.length(); i++) {
            int k = str.charAt(i) - str.charAt(i-1);
            if (Math.abs(k) != 2) {
                return false;
            }
        }
        return true;
    }
}
