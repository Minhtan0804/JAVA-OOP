package Class_and_Object.J04019;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(Point A, Point B, Point C) {
        a = A.toDistance(B);
        b = B.toDistance(C);
        c = C.toDistance(A);
    }

    public boolean valid() {
        if (a + b > c && b + c > a && a + c > b) return true;
        return false;
    }

    public String getPerimeter() {
        return String.format("%.3f", a + b + c);
    }
}