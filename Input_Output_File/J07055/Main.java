package Input_Output_File.J07055;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07055\\BANGDIEM.in"));
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            studentArrayList.add(student);
        }

        Collections.sort(studentArrayList);

        for (Student student : studentArrayList)
            System.out.println(student);

    }
}
