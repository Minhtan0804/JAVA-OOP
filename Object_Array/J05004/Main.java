package Object_Array.J05004;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    Double.valueOf(sc.nextLine()));
//            student.capitalize();
            studentList.add(student);
        }

        for (Student student : studentList)
            System.out.println(student);
    }
}
