package Object_Array.J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Product product = new Product(sc.nextLine(), sc.nextLine(),
                    Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()));
            product.profitCalc();
            productList.add(product);
        }


        Collections.sort(productList);

        for (Product product : productList)
            System.out.println(product);
    }
}
