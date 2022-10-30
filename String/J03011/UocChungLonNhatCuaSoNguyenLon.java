package String.J03011;

import java.math.BigInteger;
import java.util.Scanner;

public class UocChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            BigInteger num_1 = sc.nextBigInteger(),
                    num_2 = sc.nextBigInteger();

            System.out.println(num_1.gcd(num_2));
        }
    }
}
