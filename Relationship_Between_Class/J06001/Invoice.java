package Relationship_Between_Class.J06001;

import java.util.concurrent.atomic.AtomicInteger;

public class Invoice {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String invoiceID;
    private String productID;
    private int type;
    private int quantity;
    private double discount;

    public Invoice(String invoice) {
        String[] str = invoice.split("\\s+");
        this.invoiceID = String.format("%s-%03d", str[0], count.incrementAndGet());
        this.productID = str[0].substring(0,2);
        this.type = Integer.parseInt(str[0].substring(2,3));
        this.quantity = Integer.parseInt(str[1]);
        this.discount = toGetDiscount(this.quantity);
    }



    public static double toGetDiscount(int quantity) {
        if (quantity >= 150)
            return 0.5;
        else if (quantity >= 100)
            return 0.3;
        else if (quantity >= 50)
            return 0.15;
        else
            return 0;
    }

    public String getProductID() {
        return productID;
    }

    public int getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return invoiceID + " ";
    }
}
