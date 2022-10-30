package String.J03038;

import java.util.Scanner;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] a = new int[26];
        for (int i = 0; i < str.length(); i++) {
            a[(int)str.charAt(i) - (int)'a']++;
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (a[i] != 0) cnt++;
        }

        System.out.println(cnt);
    }
}
