package Object_Array.J05007;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Employee employee = new Employee(sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            employeeList.add(employee);
        }

        Collections.sort(employeeList);

        for (Employee employee : employeeList)
            System.out.println(employee);
    }
}
