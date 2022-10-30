package String.J03016;

import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while (t-- > 0) {
            BigInteger num = sc.nextBigInteger();
            BigInteger i = new BigInteger("11");
            BigInteger k = new BigInteger("0");

            BigInteger temp = num.mod(i);

            if (temp.compareTo(k) == 0) {
                System.out.println('1');
            } else {
                System.out.println('0');
            }
        }
    }
}
