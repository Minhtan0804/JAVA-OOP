package String.J03039;

import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while (t-- > 0) {
            BigInteger num_1 = sc.nextBigInteger();
            BigInteger num_2 = sc.nextBigInteger();
            BigInteger result = new BigInteger("0");
            BigInteger temp;

            if (num_1.compareTo(num_2) < 0) {
                temp = num_2.mod(num_1);
            } else {
                temp = num_1.mod(num_2);
            }

            if (result.compareTo(temp) != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
