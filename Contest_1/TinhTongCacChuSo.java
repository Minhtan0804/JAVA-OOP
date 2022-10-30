package Contest_1;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());

        while (t-- > 0) {
            String temp = sc.nextLine();
            char[] arr = temp.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);

            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isAlphabetic(str.charAt(i))) {
                    System.out.print(str.charAt(i));
                } else {
                    sum += str.charAt(i) - '0';
                }
            }
            System.out.println(sum);
        }
    }
}
