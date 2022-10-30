package Relationship_Between_Class.J06004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] temp = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            studentArrayList.add(student);
        }

        Collections.sort(studentArrayList);

        Map<Integer, Exercise> exerciseMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            Exercise exercise = new Exercise(sc.nextLine());
            exerciseMap.put(exercise.getGroupID(), exercise);
        }


        for (Student student : studentArrayList) {
            System.out.println(student + " " + exerciseMap.get(student.getGroupID()));

        }
    }
}
