package String.J03019;

import java.util.Scanner;

public class XauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(LexicographicalMaxString(str));
    }

    static String LexicographicalMaxString(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (res.compareTo(str.substring(i)) <= 0) {
                res = str.substring(i);
            }
        }

        return res;
    }
}
