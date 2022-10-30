package Object_Array.J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<StudentPoint> studentPointList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StudentPoint studentPoint = new StudentPoint(sc.nextLine(), sc.nextLine());
            studentPointList.add(studentPoint);
        }

        Collections.sort(studentPointList);

        for (StudentPoint studentPoint : studentPointList)
            System.out.println(studentPoint);
    }
}
