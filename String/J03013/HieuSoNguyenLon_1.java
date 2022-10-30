package String.J03013;

import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());

        while (t-- > 0) {
            BigInteger num_1 = sc.nextBigInteger();
            BigInteger num_2 = sc.nextBigInteger();
            BigInteger result = num_1.subtract(num_2);
            result = result.abs();

//            int len_1 = num_1.toString().length();
//            int len_2 = num_2.toString().length();
//            int len_res = result.toString().length();
//
//            if (len_1 < len_2) {
//                len_1 = len_2;
//            }
//
//            if(len_1 > len_res){
//                for (int i = 1; i <= len_1 - len_res; i++) {
//                    System.out.print("0");
//                }
//            }

            System.out.println(result);
        }

    }
}
