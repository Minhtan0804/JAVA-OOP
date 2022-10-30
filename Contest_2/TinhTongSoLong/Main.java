package Contest_2.TinhTongSoLong;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Contest_2\\TinhTongSoLong\\DATA.in"));
        long intSum = 0;
        long longSum = 0;

        while (sc.hasNext()) {
            String num = sc.next();
            try {
                intSum += Integer.parseInt(num);
                longSum += Long.parseLong(num);
            } catch (Exception e) {

            }
        }

        System.out.println(longSum - intSum);
    }
}
