package Object_Array.J05027;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine());
        List<Teacher> teacherList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Teacher teacher = new Teacher(sc.nextLine(), sc.nextLine());
            teacher.toGetSubjectCode();
            teacherList.add(teacher);
        }

        int Q = Integer.valueOf(sc.nextLine());
        List<Query> queryList = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            Query query= new Query(sc.nextLine());
            queryList.add(query);
        }

        for (Query query : queryList) {
            System.out.println(query);
            for (Teacher teacher : teacherList)
                if (teacher.getFullName().contains(query.getKeyWord()))
                    System.out.println(teacher);
        }
    }
}
