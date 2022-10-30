package String.J03005;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaXauHoTen_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String str = sc.nextLine();
            ArrayList<String> list = new ArrayList<>();

            StringTokenizer stringTokenizer = new StringTokenizer(str);
            while (stringTokenizer.hasMoreTokens()) {
                String s = stringTokenizer.nextToken().toLowerCase();
                list.add(String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1));
            }

            for (int i = 1; i < list.size(); i++)
                System.out.print(list.get(i) + " ");

            System.out.println("\b, " + list.get(0).toUpperCase());
        }
    }
}


//4
//        nGUYEn    quaNG   vInH
//        tRan   thi THU    huOnG
//        nGO   quoC  VINH
//        lE            tuAn    aNH