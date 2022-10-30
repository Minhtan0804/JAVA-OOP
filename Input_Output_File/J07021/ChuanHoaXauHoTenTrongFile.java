package Input_Output_File.J07021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07021\\DATA.in"));
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String str = sc.nextLine().toLowerCase();
            if (str.equals("end"))
                break;

            StringBuilder res = new StringBuilder();
            StringTokenizer s = new StringTokenizer(str);

            while (s.hasMoreTokens()) {
                String temp = s.nextToken();
                res.append(Character.toUpperCase(temp.charAt(0)));
                res.append(temp.substring(1));
                res.append(" ");
            }

            System.out.println(res);
        }
    }
}
