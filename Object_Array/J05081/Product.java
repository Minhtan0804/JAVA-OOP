package Object_Array.J05081;

import java.util.concurrent.atomic.AtomicInteger;

public class Product implements Comparable<Product>{
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private final String name;
    private final String unit;
    private final int puchasePrice;
    private final int sellPrice;
    private int profit;


    public Product(String name, String unit, int puchasePrice, int sellPrice) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.unit = unit;
        this.puchasePrice = puchasePrice;
        this.sellPrice = sellPrice;
        this.profit = profit;
    }

    public void profitCalc() {
        this.profit = this.sellPrice - this.puchasePrice;
    }


    @Override
    public int compareTo(Product o) {
        if (this.profit < o.profit)
            return 1;
        if (this.profit == o.profit && this.id > o.id)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return String.format("MH%03d %s %s %d %d %d", this.id, this.name,
                this.unit, this.puchasePrice, this.sellPrice, this.profit);
    }
}
