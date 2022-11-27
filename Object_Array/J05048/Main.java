package Object_Array.J05048;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Merchandise> merchandiseArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Merchandise merchandise = new Merchandise(sc.nextLine(), Long.parseLong(sc.nextLine()));
            merchandiseArrayList.add(merchandise);
        }

        for (Merchandise merchandise : merchandiseArrayList)
            System.out.println(merchandise);
    }
}
