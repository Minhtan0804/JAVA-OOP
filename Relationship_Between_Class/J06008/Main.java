package Relationship_Between_Class.J06008;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, Subject> subjectMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            Subject subject = new Subject(sc.next(), sc.nextLine());
            subjectMap.put(subject.getSubjectID(), subject);
        }

        int m = Integer.parseInt(sc.nextLine());
        Map<String, Teacher> teacherMap = new LinkedHashMap<>();
        for (int i = 0; i < m; i++) {
            Teacher teacher = new Teacher(sc.next(), sc.nextLine());
            teacherMap.put(teacher.getTeacherID(), teacher);
        }

        int p = Integer.parseInt(sc.nextLine());
        Map<String, Class> classMap = new LinkedHashMap<>();
        for (int i = 0; i < p; i++) {
            Teacher teacher = teacherMap.get(sc.next());
            Subject subject = subjectMap.get(sc.next());
            double time = sc.nextDouble();
            teacher.setTimeOfTeach(time);
            Class clas = new Class(teacher, subject, time);
            teacher.setClassList(clas);

            classMap.put(teacher.getTeacherID(), clas);
        }

        String query = sc.next();
        System.out.println(teacherMap.get(query));
    }
}
