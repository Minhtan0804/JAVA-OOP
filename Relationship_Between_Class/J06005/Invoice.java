package Relationship_Between_Class.J06005;

import java.util.concurrent.atomic.AtomicInteger;

public class Invoice {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String invoiceID;
    private Client client;
    private Product product;
    private int quantity;

    public Invoice(Client client, Product product, int quantity) {
        this.invoiceID = String.format("HD%03d", count.incrementAndGet());
        this.client = client;
        this.product = product;
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %d %d %d %d",
                invoiceID,
                client.getClientName(),
                client.getAddress(),
                product.getProductName(),
                product.getUnit(),
                product.getPurchasePrice(),
                product.getSellPrice(),
                quantity,
                quantity * product.getSellPrice());
    }
}
