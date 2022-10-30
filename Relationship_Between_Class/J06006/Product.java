package Relationship_Between_Class.J06006;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String productID;
    private String productName;
    private String unit;
    private int purchasePrice;
    private int sellPrice;
    private int unitProfit;


    public Product(String productName, String unit, int purchasePrice, int sellPrice) {
        this.productID = String.format("MH%03d", count.incrementAndGet());
        this.productName = productName;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
        this.unitProfit = sellPrice - purchasePrice;
    }

    public String getProductID() {
        return productID;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getUnitProfit() {
        return unitProfit;
    }

    @Override
    public String toString() {
        return this.productName + " ";
    }
}

