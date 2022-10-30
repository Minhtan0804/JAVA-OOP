package Input_Output_File.J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\DanhSachDoanhNghiep\\DN.in"));
        Scanner sc = new Scanner(new File("DN.in"));

        int n = Integer.parseInt(sc.nextLine());

        List<Enterprise> enterpriseList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Enterprise enterprise = new Enterprise(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            enterpriseList.add(enterprise);
        }

        Collections.sort(enterpriseList);

        for (Enterprise enterprise : enterpriseList)
            System.out.println(enterprise);
    }
}
