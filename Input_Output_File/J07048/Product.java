package Input_Output_File.J07048;

public class Product implements Comparable<Product> {
    private String productID;
    private String productName;
    private int price;
    private int warrantyPeriod;

    public Product(String productID, String productName, int price, int warrantyPeriod) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public int compareTo(Product o) {
        if (this.price < o.price)
            return 1;
        if (this.price == o.price && this.productID.compareTo(o.productID) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", this.productID, this.productName, this.price, this.warrantyPeriod);
    }
}
