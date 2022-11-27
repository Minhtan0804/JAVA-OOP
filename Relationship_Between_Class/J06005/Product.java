package Relationship_Between_Class.J06005;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String productID;
    private String productName;
    private String unit;
    private int purchasePrice;
    private int sellPrice;


    public Product(String productName, String unit, int purchasePrice, int sellPrice) {
        this.productID = String.format("MH%03d", count.incrementAndGet());
        this.productName = productName;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getUnit() {
        return unit;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}

