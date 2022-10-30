package Input_Output_File.J07054;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07054\\BANGDIEM.in"));
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            studentArrayList.add(student);
        }

        Collections.sort(studentArrayList);

        int count = 1;
        int temp = 1;
        System.out.println(studentArrayList.get(0) + String.valueOf(count));
        for (int i = 1; i < n; i++) {
            if (studentArrayList.get(i).getAveragePoint() != studentArrayList.get(i - 1).getAveragePoint()) {
                count += temp;
                temp = 1;
            } else
                temp++;

            System.out.println(studentArrayList.get(i) + String.valueOf(count));
        }

    }
}
