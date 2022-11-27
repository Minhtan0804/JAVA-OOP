package Object_Array.J05053;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> productArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Product product = new Product(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            productArrayList.add(product);
        }

        Collections.sort(productArrayList);

        for (Product product : productArrayList)
            System.out.println(product);
    }
}
