package Class_and_Object.J07058;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Class_and_Object\\J07058\\MONHOC.in"));
        Scanner sc = new Scanner(new File("MONHOC.in"));

        int n = Integer.parseInt(sc.nextLine());
        List<Exam> examList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Exam exam = new Exam(sc.nextLine(), sc.nextLine(), sc.nextLine());
            examList.add(exam);
        }

        Collections.sort(examList);

        for (Exam exam : examList)
            System.out.println(exam);
    }
}
