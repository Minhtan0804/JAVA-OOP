package Class_and_Object.J04013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Examimee A = new Examimee(sc.nextLine(), sc.nextLine(),
                Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        System.out.println(A);
    }
}
