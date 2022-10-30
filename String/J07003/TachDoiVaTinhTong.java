package String.J07003;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class TachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String num = "";
        try {
            num = sc.next();
        } catch (Exception e) {

        }
        while (num.length() > 1) {
            BigInteger num1 = new BigInteger(num.substring(0, num.length()/2));
            BigInteger num2 = new BigInteger(num.substring(num.length()/2));
            num = (num1.add(num2)).toString();
            System.out.println(num);
        }
        sc.close();

    }
}
