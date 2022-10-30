package Input_Output_File.J07050;

import java.util.concurrent.atomic.AtomicInteger;

public class Product implements Comparable<Product> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String productID;
    private String productName;
    private String productGroup;
    private float purchasePrice;
    private float sellPrice;
    private float benefit;

    public Product(String productName, String productGroup, float purchasePrice, float sellPrice) {
        this.productID = String.format("MH%02d", count.incrementAndGet());
        this.productName = productName;
        this.productGroup = productGroup;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
        this.benefit = sellPrice - purchasePrice;
    }

    @Override
    public int compareTo(Product o) {
        return this.benefit < o.benefit ? 1 : -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f", this.productID, this.productName, this.productGroup, this.benefit);
    }
}
