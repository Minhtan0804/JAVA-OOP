package Object_Array.J05028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine());

        List<Enterprise> enterpriseList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Enterprise enterprise = new Enterprise(sc.nextLine(), sc.nextLine(), Integer.valueOf(sc.nextLine()));
            enterpriseList.add(enterprise);
        }

        Collections.sort(enterpriseList);

        for (Enterprise enterprise : enterpriseList)
            System.out.println(enterprise);
    }
}
