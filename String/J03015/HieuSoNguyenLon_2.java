package String.J03015;

import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num_1 = sc.nextBigInteger();
        BigInteger num_2 = sc.nextBigInteger();
        BigInteger result = num_1.subtract(num_2);
//        result = result.abs();

        System.out.println(result);
    }
}
