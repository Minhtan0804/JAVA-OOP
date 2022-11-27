package Object_Array.J05008;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            ArrayList<Point> pointArrayList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Point point = new Point(sc.nextInt(), sc.nextInt());
                pointArrayList.add(point);
            }
            double area = 0;
            for (int i = 0; i < n - 1; i++) {
                area += (pointArrayList.get(i).getX() * pointArrayList.get(i + 1).getY() - pointArrayList.get(i).getY() * pointArrayList.get(i + 1).getX());
            }
            area += (pointArrayList.get(n - 1).getX() * pointArrayList.get(0).getY() - pointArrayList.get(n - 1).getY() * pointArrayList.get(0).getX());
            System.out.printf("%.3f\n", area / 2);
        }
    }
}