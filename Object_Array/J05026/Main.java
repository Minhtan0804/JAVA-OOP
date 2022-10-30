package Object_Array.J05026;

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
            teacher.toGetSubjectCode();
            teacherList.add(teacher);
        }

        int Q = Integer.valueOf(sc.nextLine());
        List<Query> queryList = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            Query query= new Query(sc.nextLine());
            query.toGetSubjectCode();
            queryList.add(query);
        }

        for (Query query : queryList) {
            System.out.println("DANH SACH GIANG VIEN BO MON " + query.getSubjectCode() + ":");
            for (Teacher teacher : teacherList)
                if (teacher.getSubject().compareTo(query.getSubjectName()) == 0)
                    System.out.println(teacher);
        }




//        for (Teacher teacher : teacherList)
//            System.out.println(teacher);
    }
}
