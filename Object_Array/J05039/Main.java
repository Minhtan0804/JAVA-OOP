package Object_Array.J05039;

import Object_Array.J05040.Wage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine());
        List<Object_Array.J05040.Wage> wageList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Object_Array.J05040.Wage wage = new Object_Array.J05040.Wage(sc.nextLine(), Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()), sc.nextLine());
            wageList.add(wage);
        }

        for (Wage wage : wageList)
            System.out.println(wage);
    }
}
