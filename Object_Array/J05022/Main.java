package Object_Array.J05022;

import java.util.ArrayList;
import java.util.Collections;
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
                queryList.add(sc.nextLine());
        }

        for (String query : queryList) {
            System.out.println("DANH SACH SINH VIEN LOP " + query + ":");
            for (int i = 0; i < n; i++) {
                if (studentList.get(i).getClassName().compareTo(query) == 0)
                    System.out.println(studentList.get(i));
            }
        }
    }
}
