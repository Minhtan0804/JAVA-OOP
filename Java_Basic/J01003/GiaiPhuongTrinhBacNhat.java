package Java_Basic.J01003;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a == 0 && b != 0) System.out.println("VN");
        else if (a == 0 && b == 0) System.out.println("VSN");
        else System.out.format("%.2f", (double) -b/a);
    }
}
