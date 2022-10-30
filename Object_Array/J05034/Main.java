package Object_Array.J05034;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<Intern> internList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Intern intern = new Intern(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            internList.add(intern);
        }

        Collections.sort(internList);

        int Q = Integer.valueOf(sc.nextLine());
        List<Enterprise> enterpriseList = new ArrayList<>();

        for (int i = 0; i < Q; i++) {
            Enterprise enterprise = new Enterprise(sc.nextLine());
            enterpriseList.add(enterprise);
        }

        for (Enterprise enterprise : enterpriseList) {
            for (Intern intern : internList) {
                if (intern.getBusinessCode().compareTo(enterprise.getBusinessCode()) == 0)
                    System.out.println(intern);
            }
        }
    }
}
