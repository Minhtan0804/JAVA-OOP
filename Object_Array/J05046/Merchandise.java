package Object_Array.J05046;

public class Merchandise {
    private String productName;
    private String merchandiseID;
    private String merchandiseName;
    private int quantum;
    private int unit;
    private int discount;
    private int toMoney;

    public Merchandise(String merchandiseName, int quantum, int unit) {
        this.merchandiseName = merchandiseName;
        String[] str = merchandiseName.toUpperCase().split("\\s+");
        this.productName = str[0].substring(0, 1) + str[1].substring(0, 1);
        this.quantum = quantum;
        this.unit = unit;
        this.discount = getDiscount(quantum, unit);
        this.toMoney = quantum * unit - this.discount;
    }

    public void setMerchandiseID(String merchandiseID) {
        this.merchandiseID = merchandiseID;
    }

    public String getProductName() {
        return productName;
    }

    public int getDiscount(int quantum, int unit) {
        int discountMoney = quantum * unit;

        if (quantum > 10)
            return discountMoney / 20;
        else if (quantum >= 8)
            return discountMoney / 50;
        else if (quantum >=5)
            return discountMoney / 100;
        else
            return 0;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", this.merchandiseID, this.merchandiseName, this.discount, this.toMoney);
    }
}
