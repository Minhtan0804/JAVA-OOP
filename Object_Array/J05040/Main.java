package Object_Array.J05040;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine());
        List<Wage> wageList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Wage wage = new Wage(sc.nextLine(), Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()), sc.nextLine());
            wageList.add(wage);
        }

        Collections.sort(wageList);

        for (Wage wage : wageList)
            System.out.println(wage);
    }
}
