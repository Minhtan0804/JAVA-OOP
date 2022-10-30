package Class_and_Object.J04010;

import java.text.DecimalFormat;
import java.util.Scanner;

class areaCircle {
    private double x, y;

    public areaCircle() {

    }

    public areaCircle(double x, double y) {
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

    public double distance(areaCircle secondPoint) {
        double d1 = this.x - secondPoint.x;
        double d2 = this.y - secondPoint.y;

        return Math.sqrt((d1 * d1) + (d2 * d2));
    }

}

public class DienTichHinhTronNgoaiTiepTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            areaCircle p1 = new areaCircle();
            p1.setX(sc.nextDouble());
            p1.setY(sc.nextDouble());

            areaCircle p2 = new areaCircle();
            p2.setX(sc.nextDouble());
            p2.setY(sc.nextDouble());

            areaCircle p3 = new areaCircle();
            p3.setX(sc.nextDouble());
            p3.setY(sc.nextDouble());

            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);

            DecimalFormat decimalFormat = new DecimalFormat("#0.000");
            if (a + b > c && a + c > b && b + c > a) {
                double temp = Math.sqrt((a + b + c) * (a + b - c)
                        * (a - b + c) * (-a + b + c)) / (double) 4;
                double r = (a * b * c) / ((double)4 * temp);

                double area = Math.PI * r * r;
                System.out.println(decimalFormat.format(area));
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
