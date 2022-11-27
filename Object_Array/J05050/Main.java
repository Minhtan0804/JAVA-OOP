package Object_Array.J05050;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ElectricBill> billArrayList = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            ElectricBill bill = new ElectricBill(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            billArrayList.add(bill);
        }

        for (ElectricBill bill : billArrayList)
            System.out.println(bill);
    }
}
