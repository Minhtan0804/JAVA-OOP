package Object_Array.J05038;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine());
        List<Payroll> payrollList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Payroll payroll = new Payroll(sc.nextLine(), Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()), sc.nextLine());
            payrollList.add(payroll);
        }

        int sumSalary = 0;
        for (Payroll payroll : payrollList) {
            sumSalary += payroll.getRealSalary();
            System.out.println(payroll);
        }
        System.out.println("Tong chi phi tien luong: " + sumSalary);
    }
}
