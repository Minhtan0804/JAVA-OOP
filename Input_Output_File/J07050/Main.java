package Input_Output_File.J07050;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07050\\MATHANG.in"));
        Scanner sc = new Scanner(new File("MATHANG.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> productArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Product product = new Product(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            productArrayList.add(product);
        }

        Collections.sort(productArrayList);

        for (Product product : productArrayList)
            System.out.println(product);
    }
}
