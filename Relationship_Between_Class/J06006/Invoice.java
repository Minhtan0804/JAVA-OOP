package Relationship_Between_Class.J06006;

import java.util.concurrent.atomic.AtomicInteger;

public class Invoice implements Comparable<Invoice> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String invoiceID;
    private String clientID;
    private String productID;
    private int quantity;
    private int profit;

    public Invoice(String invoice) {
        this.invoiceID = String.format("HD%03d", count.incrementAndGet());
        String[] str = invoice.split("\\s+");
        this.clientID = str[0];
        this.productID = str[1];
        this.quantity = Integer.parseInt(str[2]);
    }

    public void setProfit(int unitProfit) {
        this.profit = unitProfit * this.quantity;
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

    public int getProfit() {
        return profit;
    }

    @Override
    public int compareTo(Invoice o) {
        if (this.profit < o.profit)
            return 1;
        if (this.profit == o.profit && this.invoiceID.compareTo(o.invoiceID) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return this.invoiceID + " ";
    }
}
