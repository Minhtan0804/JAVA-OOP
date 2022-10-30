package Java_Basic.JAHA006;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            double a, b, c, d, e, f;
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            d = sc.nextDouble();
            e = sc.nextDouble();
            f = sc.nextDouble();

            double x = distance(a, b, c, d);
            double y = distance(c, d, e, f);
            double z = distance(e, f, a, b);

            if (x + y <= z || y + z <= x || z + x <= y) {
                System.out.println("INVALID");
            } else {
                double p = (x + y + z) / 2;
                double s = Math.sqrt((x + y + z) * (x + y -z) * (- x + y + z) * (x - y + z)) / 4;
                System.out.printf("%.4f\n", s);
            }
        }
    }

    public static double distance(double a, double b, double c, double d) {
        double x = a - c;
        double y = b - d;
        return Math.sqrt(x * x + y * y);
    }
}
