package Object_Array.J05043;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine());
        List<Income> incomeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Income income = new Income(sc.nextLine(), sc.nextLine(), Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()));
            incomeList.add(income);
        }

        for (Income income : incomeList)
            System.out.println(income);
    }
}
