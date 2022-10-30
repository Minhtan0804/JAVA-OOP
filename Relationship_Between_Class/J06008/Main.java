package Relationship_Between_Class.J06008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, Subject> subjectMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Subject subject = new Subject(sc.nextLine());
            subjectMap.put(subject.getSubjectID(), subject);
        }

        int m = Integer.parseInt(sc.nextLine());
        Map<String, Teacher> teacherMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            Teacher teacher = new Teacher(sc.nextLine());
            teacherMap.put(teacher.getTeacherID(), teacher);
        }

        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String[] str = sc.nextLine().split("\\s+");
            String teacherID = str[0];
            String subjectID = str[1];
            double hour = Double.parseDouble(str[2]);

            Teacher teacher = teacherMap.get(teacherID);
            teacher.setHour(teacher.getHour() + hour);

            teacherMap.put(teacherID, teacher);
        }
        SortedSet<String> set = new TreeSet<>(teacherMap.keySet());

        for (String key : set)
            System.out.println(teacherMap.get(key));
    }
}
