package Class_and_Object.J04008;

import java.text.DecimalFormat;
import java.util.Scanner;

class PointTriangle {
    private double x, y;

    public PointTriangle() {

    }

    public PointTriangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(PointTriangle secondPoint) {
        double d1 = this.x - secondPoint.x;
        double d2 = this.y - secondPoint.y;

        return Math.sqrt((d1 * d1) + (d2 * d2));
    }

}

public class ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            PointTriangle p1 = new PointTriangle();
            p1.setX(sc.nextDouble());
            p1.setY(sc.nextDouble());

            PointTriangle p2 = new PointTriangle();
            p2.setX(sc.nextDouble());
            p2.setY(sc.nextDouble());

            PointTriangle p3 = new PointTriangle();
            p3.setX(sc.nextDouble());
            p3.setY(sc.nextDouble());

            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);

            DecimalFormat decimalFormat = new DecimalFormat("#0.000");
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println(decimalFormat.format(a + b + c));
            } else {
                System.out.println("INVALID");
            }

        }
    }
}
