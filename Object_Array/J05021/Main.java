package Object_Array.J05021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        while (sc.hasNext()) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            studentList.add(student);
        }

        Collections.sort(studentList);

        for (Student student : studentList)
            System.out.println(student);
    }
}
