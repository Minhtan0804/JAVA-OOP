package Object_Array.J05053;

public class Product implements Comparable<Product> {
    private String productName;
    private String productID;
    private long unitPrice;
    private long quantity;
    private String orderNumber;
    private long discount;
    private long payMoney;

    public Product(String productName, String productID, long unitPrice, long quantity) {
        this.productName = productName;
        this.productID = productID;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.orderNumber = productID.substring(1, 4);
        this.discount = (long) (unitPrice * quantity * toGetDiscount(productID) /100.0);
        this.payMoney = this.unitPrice * this.quantity - this.discount;
    }

    private long toGetDiscount(String s) {
        if (s.endsWith("1"))
            return 50;

        return 30;
    }

    @Override
    public int compareTo(Product o) {
        return this.orderNumber.compareTo(o.orderNumber);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", this.productName, this.productID, this.orderNumber, this.discount, this.payMoney);
    }
}
