package String.J03012;

import java.math.BigInteger;
import java.util.Scanner;

public class TongSoNguyenLon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while(t-- > 0) {
            BigInteger num_1 = sc.nextBigInteger();
            BigInteger num_2 = sc.nextBigInteger();
            BigInteger result = num_1.add(num_2);

            System.out.println(result);
        }
    }
}
