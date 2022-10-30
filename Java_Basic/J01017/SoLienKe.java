package Java_Basic.J01017;

import java.util.Scanner;

public class SoLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            solve(str);
        }

    }

    public static void solve(String str) {

        for (int i = 1; i < str.length(); i++) {
            int k = str.charAt(i) - str.charAt(i-1);
//            System.out.println(k);
            if (Math.abs(k) != 1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
