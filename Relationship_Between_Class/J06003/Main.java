package Relationship_Between_Class.J06003;

import java.util.*;
import java.util.stream.Collectors;

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
        for (int i = 1; i <= m; i++) {
            Exercise exercise = new Exercise(sc.nextLine());
            exercise.setStudentList(studentArrayList.stream()
                    .filter(x -> x.getGroupID() == exercise.getGroupID())
                    .collect(Collectors.toList()));
            exerciseMap.put(exercise.getGroupID(), exercise);
        }

        int Q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < Q; i++) {
            int query = Integer.parseInt(sc.nextLine());
            System.out.println("DANH SACH NHOM " + query + ":");
            Exercise exercise = exerciseMap.get(query);
            for (Student student : exercise.getStudentList())
                System.out.println(student);

            System.out.println(exercise);
        }
    }
}
