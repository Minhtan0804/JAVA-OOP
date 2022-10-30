package Java_Basic.J01033;

import java.math.BigInteger;
import java.util.Scanner;

public class BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            BigInteger num1 = sc.nextBigInteger();
            BigInteger num2 = sc.nextBigInteger();

            if (num1.signum() == 0 || num2.signum() == 0)
                System.out.println(BigInteger.ZERO);
            else
                System.out.println(num1.divide(num1.gcd(num2)).multiply(num2).abs());
        }
    }

}
