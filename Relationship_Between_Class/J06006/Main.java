package Relationship_Between_Class.J06006;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, Client> clientMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Client client = new Client(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            clientMap.put(client.getClientID(), client);
        }

        int m = Integer.parseInt(sc.nextLine());
        Map<String, Product> productMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            Product product = new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            productMap.put(product.getProductID(), product);
        }

        int v = Integer.parseInt(sc.nextLine());
        ArrayList<Invoice> invoiceArrayList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            Invoice invoice = new Invoice(sc.nextLine());
            invoice.setProfit(productMap.get(invoice.getProductID()).getUnitProfit());
            invoiceArrayList.add(invoice);
        }

        Collections.sort(invoiceArrayList);

        for (Invoice invoice : invoiceArrayList) {
            System.out.print(invoice);
            System.out.print(clientMap.get(invoice.getClientID()));
            Product product = productMap.get(invoice.getProductID());
            int price = product.getSellPrice() * invoice.getQuantity();
            System.out.println(product + String.format("%d %d %d",invoice.getQuantity(), price, invoice.getProfit()));
        }
    }
}
