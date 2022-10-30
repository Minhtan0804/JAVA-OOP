package Object_Array.J05009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<Examinee> examineeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Examinee examinee = new Examinee(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            examineeList.add(examinee);
        }

        Collections.sort(examineeList);

        double temp = examineeList.get(0).getTotalPoint();

//        System.out.println(temp);

        for (int i = 0; i < n; i++) {
            if (temp == examineeList.get(i).getTotalPoint())
                System.out.println(examineeList.get(i));
            else
                break;
        }
    }
}
