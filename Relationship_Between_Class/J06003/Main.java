package Relationship_Between_Class.J06003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] temp = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            studentArrayList.add(student);
        }

        Map<Integer, Exercise> exerciseMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            Exercise exercise = new Exercise(sc.nextLine());
            exerciseMap.put(exercise.getGroupID(), exercise);
        }

        int Q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < Q; i++) {
            int query = Integer.parseInt(sc.nextLine());
            System.out.println("DANH SACH NHOM " + query + ":");
            for (Student student : studentArrayList) {
                if (student.getGroupID() == query)
                    System.out.println(student);
            }

            System.out.println(exerciseMap.get(query));
        }
    }
}
