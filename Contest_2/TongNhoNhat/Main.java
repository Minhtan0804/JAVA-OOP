package Contest_2.TongNhoNhat;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Contest_2\\TongNhoNhat\\DAYSO.in"));
        Scanner sc = new Scanner(new File("DAYSO.in"));

        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            String[] str = sc.nextLine().split("\\s+");
            Arrays.sort(str);
            StringBuilder num1 = new StringBuilder();
            StringBuilder num2 = new StringBuilder();

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0)
                    num1.append(str[i]);
                else
                    num2.append(str[i]);
            }

            long a = Long.parseLong(num1.toString());
            long b = Long.parseLong(num2.toString());
//            int b = Integer.parseInt(num2.toString());
            System.out.println(a + b);
        }
    }
}
