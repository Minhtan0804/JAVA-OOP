package Object_Array.J05023;

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
        List<String> queryList = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
                queryList.add(sc.nextLine().substring(2));
        }

        for (String query : queryList) {
            System.out.println("DANH SACH SINH VIEN KHOA 20" + query + ":");
            for (int i = 0; i < n; i++) {
                if (studentList.get(i).getCourseYear().compareTo(query) == 0)
                    System.out.println(studentList.get(i));
            }
        }
    }
}
