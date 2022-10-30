package Input_Output_File.J07056;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07056\\KHACHHANG.in"));
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ElectricBill> billArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ElectricBill bill = new ElectricBill(sc.nextLine(), sc.next(), sc.next(), sc.nextLine());
            billArrayList.add(bill);
        }

        Collections.sort(billArrayList);

        for (ElectricBill bill : billArrayList)
            System.out.println(bill);
    }
}
