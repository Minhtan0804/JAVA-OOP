package Contest_1;

import java.util.Arrays;
import java.util.Scanner;

public class ChuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());

        while (t-- > 0) {
            int n = Integer.valueOf(sc.nextLine());
            String str = sc.nextLine();
            str = str.toLowerCase();

            String[] a = str.split("\\s+");

            for (int i = 0; i < a.length; i++) {
                a[i] = a[i].substring(0, 1).toUpperCase() + a[i].substring(1);
//                System.out.println(a[i]);
            }

            if (n == 1) {
                System.out.print(a[a.length-1] + " ");

                for (int i = 0; i < a.length - 1; i++) {
                    System.out.print(a[i]+ " ");
                }
            } else {
                for (int i = 1; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }

                System.out.print(a[0] + " ");
            }

            System.out.println();
        }
    }

}
