package Relationship_Between_Class.J06008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, Subject> subjectMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Subject subject = new Subject(sc.next(), sc.next());
            subjectMap.put(subject.getSubjectID(), subject);
        }

        int m = Integer.parseInt(sc.nextLine());
        Map<String, Teacher> teacherMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            Teacher teacher = new Teacher(sc.next(), sc.next());
            teacherMap.put(teacher.getTeacherID(), teacher);
        }

        int p = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < p; i++) {
            Teacher teacher = teacherMap.get(sc.next());
            teacher.setSubjectList(subjectMap.get(sc.next()));
            Subject subject = subjectMap.get(sc.next());
        }
    }
}
