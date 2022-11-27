package Object_Array.J05057;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Examimee> examimeeArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Examimee examimee = new Examimee(sc.nextLine(), sc.nextLine(),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            examimeeArrayList.add(examimee);
        }

        for (Examimee examimee : examimeeArrayList)
            System.out.println(examimee);
    }
}
