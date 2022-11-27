package Input_Output_File.J07052;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07052\\THISINH.in"));
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Examimee> examimeeArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Examimee examimee = new Examimee(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            examimeeArrayList.add(examimee);
        }

        int target = Integer.parseInt(sc.nextLine());

        Collections.sort(examimeeArrayList);

        double benchmack = examimeeArrayList.get(target - 1).getTotalPoint();

        System.out.printf("%.1f\n", benchmack);

        for (Examimee examimee : examimeeArrayList) {
            if (examimee.getTotalPoint() >= benchmack)
                System.out.println(examimee + "TRUNG TUYEN");
            else
                System.out.println(examimee + "TRUOT");
        }
    }
}
