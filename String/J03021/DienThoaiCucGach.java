package String.J03021;

import java.util.Locale;
import java.util.Scanner;

public class DienThoaiCucGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());

        while (t-- > 0) {
            String str = sc.nextLine();
            str = str.toUpperCase();

            String res = "";

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)>= 'A' && str.charAt(i) <='C') res += "2";
                else if (str.charAt(i)>= 'D' && str.charAt(i) <='F') res += "3";
                else if (str.charAt(i)>= 'G' && str.charAt(i) <='I') res += "4";
                else if (str.charAt(i)>= 'J' && str.charAt(i) <='L') res += "5";
                else if (str.charAt(i)>= 'M' && str.charAt(i) <='O') res += "6";
                else if (str.charAt(i)>= 'P' && str.charAt(i) <='S') res += "7";
                else if (str.charAt(i)>= 'T' && str.charAt(i) <='V') res += "8";
                else if (str.charAt(i)>= 'W' && str.charAt(i) <='Z') res += "9";
            }

            StringBuilder temp = new StringBuilder();
            temp.append(res);

            if (temp.toString().equals(temp.reverse().toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
