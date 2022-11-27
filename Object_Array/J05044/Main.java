package Object_Array.J05044;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Income> myList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Income income = new Income(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            myList.add(income);
        }

        String query = sc.nextLine();

        for (Income income : myList)
            if (income.getPosition().equals(query))
                System.out.println(income);
    }
}
