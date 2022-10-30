package String.J03004;

import java.util.Scanner;

public class ChuanHoaXauHoTen_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            str = str.toLowerCase();

            String[] temp = str.split(" ");

            for (String res : temp) {
                if (res.length() != 0) {
                    System.out.print(capitalize(res) + " ");
                }
            }
            System.out.println();

        }
    }

    public static String capitalize(String str) {
        if (str == null || str.length() < 1) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
