package Input_Output_File.J07073;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07073\\MONHOC.in"));
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Subject> subjectArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Subject subject = new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            if (subject.getPraticalTeach().length() > 9)
                subjectArrayList.add(subject);
        }

        Collections.sort(subjectArrayList);

        for (Subject subject : subjectArrayList)
            System.out.println(subject);
    }
}
