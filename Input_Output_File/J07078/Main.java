package Input_Output_File.J07078;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("STRING.in"));
//        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
                if (s1.startsWith(s2, i))
                    System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }
}
