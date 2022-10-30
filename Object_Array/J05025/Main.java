package Object_Array.J05025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine());
        List<Teacher> teacherList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Teacher teacher = new Teacher(sc.nextLine(), sc.nextLine());
            teacher.toGetLastName();
            teacher.toGetSubjectCode();
            teacherList.add(teacher);
        }

        Collections.sort(teacherList);

        for (Teacher teacher : teacherList)
            System.out.println(teacher);
    }
}
