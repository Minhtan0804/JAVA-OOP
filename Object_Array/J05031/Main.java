package Object_Array.J05031;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static final AtomicInteger count = new AtomicInteger(0);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine());
        List<SheetPoint> sheetPointList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SheetPoint sheetPoint = new SheetPoint(sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    Double.valueOf(sc.nextLine()), Double.valueOf(sc.nextLine()), Double.valueOf(sc.nextLine()));
            sheetPointList.add(sheetPoint);
        }

        Collections.sort(sheetPointList);

        for (SheetPoint sheetPoint : sheetPointList) {
            sheetPoint.setID(count.incrementAndGet());
            System.out.println(sheetPoint);
        }
    }
}
