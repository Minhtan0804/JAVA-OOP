package String.J03027;

import java.util.Scanner;

public class RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean haveClear = false;
        while (haveClear == false) {
            haveClear = true;
            int i = 0;
            while (i <= str.length() - 1) {
                int k = str.length();
                if (i == str.length() - 1) {
                    break;
                }
                if (str.charAt(i) == str.charAt(i+1)) {
                    haveClear = false;
                    str = removeCharAt(str, i);
                    i += 2;
                } else i++;
            }
        }
        if (str.isEmpty()) {
            System.out.println("Empty String");
        } else {
            System.out.println(str);
        }
    }

    public static String removeCharAt(String str, int pos) {
        if (pos + 1 != str.length() - 1) {
            return str.substring(0, pos) + str.substring(pos + 2, str.length());
        }
        return str.substring(0,pos);
    }
}
