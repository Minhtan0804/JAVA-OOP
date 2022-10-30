package String.J03026;

import java.util.Scanner;

public class XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while (t-- > 0) {
            String str1 = sc.nextLine(), str2 = sc.nextLine();
//            System.out.println(str1.compareTo(str2));

            if (str1.compareTo(str2) == 0) {
                System.out.println("-1");
            } else {
                System.out.println(Math.max(str1.length(), str2.length()));
            }
        }
    }
}
