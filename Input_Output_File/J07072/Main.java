package Input_Output_File.J07072;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07072\\DANHSACH.in"));
        Scanner sc = new Scanner(new File("DANHSACH.in"));

        ArrayList<FullName> fullNameArrayList = new ArrayList<>();
        while (sc.hasNextLine()) {
            FullName fullName = new FullName(sc.nextLine());
            fullNameArrayList.add(fullName);
        }

        Collections.sort(fullNameArrayList);

        for (FullName fullName : fullNameArrayList)
            System.out.println(fullName);
    }
}
