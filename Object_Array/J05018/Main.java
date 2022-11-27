package Object_Array.J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<StudentPoint> studentPointList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double average = 0;
            for (int j = 0; j < 10; j++) {
                double score = sc.nextDouble();
                if (j == 0 || j == 1) average += score * 2;
                else average += score;
            }
            average = Math.round(average / 12 * 10.0) / 10.0;

            StudentPoint studentPoint = new StudentPoint(name, average);
            studentPointList.add(studentPoint);
            sc.nextLine();
        }

        Collections.sort(studentPointList);

        for (StudentPoint studentPoint : studentPointList)
            System.out.println(studentPoint);
    }
}
