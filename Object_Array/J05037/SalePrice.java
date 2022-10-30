package Object_Array.J05037;

import java.util.concurrent.atomic.AtomicInteger;

public class SalePrice implements Comparable<SalePrice> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;
    private String productName;
    private String unitOfProduct;
    private double purchasePrice;
    private double quantityProduct;
    private double transferFee;
    private double intoMoney;
    private double sellPrice;

    public SalePrice(String productName, String unitOfProduct, double purchasePrice, double quantityProduct) {
        this.ID = count.incrementAndGet();
        this.productName = productName;
        this.unitOfProduct = unitOfProduct;
        this.purchasePrice = purchasePrice;
        this.quantityProduct = quantityProduct;
        this.transferFee = Math.round((purchasePrice * quantityProduct) * 0.05);
        this.intoMoney = Math.round((purchasePrice * quantityProduct) * 1.05);
//        this.sellPrice = Math.ceil((purchasePrice * quantityProduct) * 1.05 * 1.02 * 1000 / quantityProduct);
        this.sellPrice = Math.ceil(purchasePrice * 1.05 * 1.02 / 100) * 100;
    }

    @Override
    public int compareTo(SalePrice o) {
        return this.sellPrice < o.sellPrice ? 1 : -1;
    }

    @Override
    public String toString() {
        return String.format("MH%02d %s %s %.0f %.0f %.0f", this.ID, this.productName, this.unitOfProduct, this.transferFee, this.intoMoney, this.sellPrice);
    }
}
