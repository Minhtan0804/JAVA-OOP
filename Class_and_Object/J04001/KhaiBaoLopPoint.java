package Class_and_Object.J04001;

import java.text.DecimalFormat;
import java.util.Scanner;

class Point {
    private double x, y;

    public Point() {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {

    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double distance(Point secondPoint) {
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + Math.pow(this.y - secondPoint.y, 2));
    }

    public double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class KhaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point p1 = new Point();
            Point p2 = new Point();
            p1.setX(sc.nextDouble());
            p1.setY(sc.nextDouble());
            p2.setX(sc.nextDouble());
            p2.setY(sc.nextDouble());
            DecimalFormat four = new DecimalFormat("#0.0000");
            System.out.println(four.format(p1.distance(p2)));

        }
    }
}
