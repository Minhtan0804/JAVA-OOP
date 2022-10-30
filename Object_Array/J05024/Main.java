package Object_Array.J05024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            studentList.add(student);
        }
        int Q = Integer.valueOf(sc.nextLine());
        List<Query> queryList = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            Query query = new Query(sc.nextLine());
            query.toID();
            queryList.add(query);
        }

        for (Query query : queryList) {
            System.out.println("DANH SACH SINH VIEN NGANH " + query);
            for (Student student : studentList) {
                String major1 = student.getMajor();
                String major2 = query.getQueryID();
                String course = student.getCourseName();
                if (major1.compareTo(major2) == 0) {
                    if (major1.compareTo("CN") == 0 || major2.compareTo("AT")  == 0) {
                        if (course.compareTo("E") != 0)
                            System.out.println(student);
                    } else {
                        System.out.println(student);
                    }
                }
//                    System.out.println(student);
            }
        }
    }
}
