package Input_Output_File.J07010;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\DanhSachSinhVienTrongFile_2\\SV.in"));
        Scanner sc = new Scanner(new File("SV.in"));

        int n = Integer.parseInt(sc.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            studentList.add(student);
        }

        for (Student student : studentList)
            System.out.println(student);


    }
}
