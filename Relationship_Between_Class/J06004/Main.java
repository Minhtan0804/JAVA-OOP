package Relationship_Between_Class.J06004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] temp = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        Map<Integer, Group> groupMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            studentArrayList.add(student);
        }

        Collections.sort(studentArrayList);

        for (int i = 1; i <= m; i++) {
            Group group = new Group(sc.nextLine());
            groupMap.put(i, group);
        }

        for (Student student : studentArrayList) {
            student.setGroup(groupMap.get(student.getGroupID()));
            System.out.println(student);
        }
    }
}
