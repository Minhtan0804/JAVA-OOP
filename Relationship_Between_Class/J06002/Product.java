package Relationship_Between_Class.J06002;

public class Product {
    private String productID;
    private String productName;
    private int priceType1;
    private int priceType2;

    public Product(String productID, String productName, int priceType1, int priceType2) {
        this.productID = productID;
        this.productName = productName;
        this.priceType1 = priceType1;
        this.priceType2 = priceType2;
    }

    public String getProductID() {
        return productID;
    }

    public int getPriceType1() {
        return priceType1;
    }

    public int getPriceType2() {
        return priceType2;
    }

    @Override
    public String toString() {
        return this.productName + " ";
    }
}
