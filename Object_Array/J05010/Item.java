package Object_Array.J05010;

import java.util.concurrent.atomic.AtomicInteger;

public class Item implements Comparable<Item> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;
    private String nameItem;
    private String listItem;
    private double purchasePrice;
    private double sellPrice;
    private double profit;

    public Item(String nameItem, String listItem, double purchasePrice,
                double sellPrice) {;
        this.ID = count.incrementAndGet();
        this.nameItem = nameItem;
        this.listItem = listItem;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
        this.profit = sellPrice - purchasePrice;
    }


    @Override
    public int compareTo(Item o) {
        return this.profit < o.profit ? 1 : -1;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %.2f", this.ID, this.nameItem, this.listItem, this.profit);
    }
}
