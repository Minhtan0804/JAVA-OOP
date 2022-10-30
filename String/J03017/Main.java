package String.J03017;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            StringBuilder str = new StringBuilder(sc.nextLine());
            int res = 0;
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 3).equals("100")) {
                    str.delete(i, i + 3);
                    res += 3;
                    i -= 2;
                }
            }
            System.out.println(res);
        }
    }
}
