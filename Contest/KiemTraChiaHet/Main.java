package Contest.KiemTraChiaHet;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Contest\\KiemTraChiaHet\\SONGUYEN.in"));
        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        int n = sc.nextInt();
        BigInteger a = new BigInteger("7");
        BigInteger b = new BigInteger("13");
        BigInteger c = BigInteger.ZERO;
        while (n-- > 0) {
            BigInteger num = sc.nextBigInteger();
            if (num.mod(a).equals(c) && num.mod(b).equals(c))
                System.out.println("Both");
            else if (num.mod(a).equals(c))
                System.out.println("Div 7");
            else if (num.mod(b).equals(c))
                System.out.println("Div 13");
            else
                System.out.println("None");
        }
    }
}
