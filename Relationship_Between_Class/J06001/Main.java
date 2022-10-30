package Relationship_Between_Class.J06001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, Product> productMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Product product = new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            productMap.put(product.getProductID(), product);
        }

        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Invoice> invoiceArrayList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Invoice invoice = new Invoice(sc.nextLine());
            invoiceArrayList.add(invoice);
        }

        for (Invoice invoice : invoiceArrayList) {
            System.out.print(invoice);
            Product product = productMap.get(invoice.getProductID());
            System.out.print(product);
            int price = invoice.getQuantity();
            if (invoice.getType() == 1)
                price *= product.getPriceType1();
            else
                price *= product.getPriceType2();

            double discount = invoice.getDiscount();
            System.out.printf("%.0f %.0f\n",price * discount, price * (1 - discount));

        }
    }
}
