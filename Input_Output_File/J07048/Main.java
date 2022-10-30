package Input_Output_File.J07048;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07048\\SANPHAM.in"));
        Scanner sc = new Scanner(new File("SANPHAM.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> productArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Product product = new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            productArrayList.add(product);
        }

        Collections.sort(productArrayList);

        for (Product product : productArrayList)
            System.out.println(product);
    }
}
