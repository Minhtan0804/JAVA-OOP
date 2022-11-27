package Relationship_Between_Class.J06005;

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
        for (int i = 0; i < v; i++) {
            Invoice invoice = new Invoice(clientMap.get(sc.next()), productMap.get(sc.next()), sc.nextInt());
            System.out.println(invoice);
        }
    }
}
