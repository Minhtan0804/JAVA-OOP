package Relationship_Between_Class.J06006;

import java.util.concurrent.atomic.AtomicInteger;

public class Invoice implements Comparable<Invoice> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String invoiceID;
    private Client client;
    private Product product;
    private int quantity;

    private int profit;

    public Invoice(Client client, Product product, int quantity) {
        this.invoiceID = String.format("HD%03d", count.incrementAndGet());
        this.client = client;
        this.product = product;
        this.quantity = quantity;
        this.profit = quantity * product.getUnitProfit();
    }

    @Override
    public int compareTo(Invoice o) {
        if (this.profit < o.profit)
            return 1;
        else if (this.profit == o.profit && this.invoiceID.compareTo(o.invoiceID) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %d %d %d",
                invoiceID,
                client.getClientName(),
                client.getAddress(),
                product.getProductName(),
                quantity,
                quantity * product.getSellPrice(),
                profit);
    }
}
