package Java_Basic.JAHA003;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        BigInteger eleven = new BigInteger("11");
        BigInteger zero = new BigInteger("0");

        while (t-- > 0) {
            BigInteger num = new BigInteger(sc.nextLine());
            if (num.mod(eleven).equals(zero))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
