package Contest_2.ThucTapCoSo;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Contest_2\\ThucTapCoSo\\SINHVIEN.in"));
//        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int s = Integer.parseInt(sc.nextLine());
        Map<String, Student> studentMap = new HashMap<>();
        for (int i = 0; i < s; i++) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            studentMap.put(student.getStudentID(), student);
        }

        Scanner sc2 = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Contest_2\\ThucTapCoSo\\DETAI.in"));
//        Scanner sc2 = new Scanner(new File("DETAI.in"));

        int t = Integer.parseInt(sc2.nextLine());
        TreeMap<String, Topic> topicMap = new TreeMap<>();
        for (int i = 0; i < t; i++) {
            Topic topic = new Topic(sc2.nextLine(), sc2.nextLine());
            topicMap.put(topic.getTopicID(), topic);
        }

        Scanner sc3 = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Contest_2\\ThucTapCoSo\\NHIEMVU.in"));
//        Scanner sc3 = new Scanner(new File("NHIEMVU.in"));
        int m = Integer.parseInt(sc3.nextLine());
        Map<String, Misson> missonMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            Misson misson = new Misson(sc3.nextLine());
            missonMap.put(misson.getTopicID(), misson);
        }

        for (Map.Entry<String, Topic> entry : topicMap.entrySet()) {
            if (missonMap.containsKey(entry.getKey())) {
                System.out.println(studentMap.get(missonMap.get(entry.getKey()).getStudentID()));
            }
        }

    }
}
