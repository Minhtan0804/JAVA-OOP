package Relationship_Between_Class.J06002;

import java.util.*;

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
            Product product = productMap.get(invoice.getProductID());
            if (invoice.getType() == 1)
                invoice.setPrice(product.getPriceType1());
            else
                invoice.setPrice(product.getPriceType2());

            invoiceArrayList.add(invoice);
        }

        Collections.sort(invoiceArrayList);

        for (Invoice invoice : invoiceArrayList) {
            System.out.print(invoice);
            Product product = productMap.get(invoice.getProductID());
            System.out.print(product);
            System.out.printf("%.0f %.0f\n", invoice.getSalePrice(), invoice.getPrice());

        }
    }
}
