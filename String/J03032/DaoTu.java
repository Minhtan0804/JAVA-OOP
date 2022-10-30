package String.J03032;

import java.util.Scanner;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            for (String part : str.split(" ")) {
                System.out.print(new StringBuilder(part).reverse().toString());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
