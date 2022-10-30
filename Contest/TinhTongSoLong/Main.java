package Contest.TinhTongSoLong;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Contest\\TinhTongSoLong\\DATA.in"));
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            String num = sc.next();
            try {
                int n = Integer.parseInt(num);
                continue;
            } catch (NumberFormatException e){

            }

            try {
                sum += Long.parseLong(num);
            } catch (Exception e) {

            }
        }

        System.out.println(sum);
    }
}
