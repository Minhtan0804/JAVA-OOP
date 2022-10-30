package Input_Output_File.J07033;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Class_and_Object\\DanhSachVinhVienTrongFile_1\\SINHVIEN.in"));

        int t = Integer.parseInt(sc.nextLine());
        List<Student> studentList = new ArrayList<>();

        while (t-- > 0) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            studentList.add(student);
        }

        Collections.sort(studentList);

        for (Student student : studentList)
            System.out.println(student);
    }
}
