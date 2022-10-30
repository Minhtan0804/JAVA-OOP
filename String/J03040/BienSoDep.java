package String.J03040;

import java.util.Scanner;

public class BienSoDep {
    static boolean ascending(String str) {
        str = str.replace(".", "");
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) >= str.charAt(i + 1))
                return false;
        }

        return true;
    }

    static boolean equal(String str) {
        str = str.replace(".", "");
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(i + 1))
                return false;
        }

        return true;
    }

    static boolean lucky(String str) {
        str = str.replace(".", "");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '6' && str.charAt(i) != '8')
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String licensePlate = sc.nextLine().substring(5);
            if (ascending(licensePlate) || equal(licensePlate) || (equal(licensePlate.substring(0,3)) && equal(licensePlate.substring(4))) || lucky(licensePlate))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
