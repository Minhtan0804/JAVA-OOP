package Input_Output_File.J07059;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07059\\CATHI.in"));
        Scanner sc = new Scanner(new File("CATHI.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Exam> examArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Exam exam = new Exam(sc.nextLine(), sc.nextLine(), sc.nextLine());
            examArrayList.add(exam);
        }

        Collections.sort(examArrayList);

        for (Exam exam : examArrayList)
            System.out.println(exam);
    }
}
