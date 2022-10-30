package Input_Output_File.J07057;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("THISINH.in"));
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07057\\THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Examinee> examineeArrayList = new ArrayList<Examinee>();

        for (int i = 0; i < n; i++) {
            Examinee examinee = new Examinee(sc.nextLine(), Float.parseFloat(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            examineeArrayList.add(examinee);
        }

        Collections.sort(examineeArrayList);

        for (Examinee examinee : examineeArrayList) {
            System.out.println(examinee);
        }
    }
}
