package Object_Array.J05054;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Student student = new Student(sc.nextLine(), Float.parseFloat(sc.nextLine()));
            studentArrayList.add(student);
        }

        Collections.sort(studentArrayList);


        int count = 1;
        int temp = 1;

        studentArrayList.get(0).setRank(count);
        for (int i = 1; i < n; i++) {
            if (studentArrayList.get(i).getAveragePoint() != studentArrayList.get(i - 1).getAveragePoint()) {
                count += temp;
                temp = 1;
            } else {
                temp++;
            }

            studentArrayList.get(i).setRank(count);
        }

        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentID().compareTo(o2.getStudentID());
            }
        });

        for (Student student : studentArrayList)
            System.out.println(student);
    }
}
