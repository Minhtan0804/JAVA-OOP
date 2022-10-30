package Relationship_Between_Class.J06005;

import java.util.concurrent.atomic.AtomicInteger;

public class Invoice {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String invoiceID;
    private String clientID;
    private String productID;
    private int quantity;

    public Invoice(String invoice) {
        this.invoiceID = String.format("HD%03d", count.incrementAndGet());
        String[] str = invoice.split("\\s+");
        this.clientID = str[0];
        this.productID = str[1];
        this.quantity = Integer.parseInt(str[2]);
    }

    public String getClientID() {
        return clientID;
    }

    public String getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return this.invoiceID + " ";
    }
}
