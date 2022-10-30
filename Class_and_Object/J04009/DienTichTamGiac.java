package Class_and_Object.J04009;

import java.text.DecimalFormat;
import java.util.Scanner;

class areaTriangle {
    private double x, y;

    public areaTriangle() {

    }

    public areaTriangle(double x, double y) {
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

    public double distance(areaTriangle secondPoint) {
        double d1 = this.x - secondPoint.x;
        double d2 = this.y - secondPoint.y;

        return Math.sqrt((d1 * d1) + (d2 * d2));
    }

}

public class DienTichTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            areaTriangle p1 = new areaTriangle();
            p1.setX(sc.nextDouble());
            p1.setY(sc.nextDouble());

            areaTriangle p2 = new areaTriangle();
            p2.setX(sc.nextDouble());
            p2.setY(sc.nextDouble());

            areaTriangle p3 = new areaTriangle();
            p3.setX(sc.nextDouble());
            p3.setY(sc.nextDouble());

            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);

            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            if (a + b > c && a + c > b && b + c > a) {
                double temp = Math.sqrt((a + b + c) * (a + b - c)
                        * (a - b + c) * (-a + b + c)) /(double)4;
                System.out.println(decimalFormat.format(temp));
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
