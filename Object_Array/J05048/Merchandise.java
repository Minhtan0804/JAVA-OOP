package Object_Array.J05048;

public class Merchandise {
    private String ID;
    private long importQuantity;
    private String firstChar;
    private String lastChar;
    private long exportQuantity;
    private long unitPrice;
    private long price;
    private long tax;

    public Merchandise(String ID, long importQuantity) {
        this.ID = ID;
        this.importQuantity = importQuantity;
        this.firstChar = ID.substring(0, 1);
        this.lastChar = ID.substring(4);
        this.exportQuantity = Math.round((toGetExportQuantity(this.firstChar) * importQuantity) / 10.0);
        this.unitPrice = toGetUnitPrice(this.lastChar);
        this.price = this.exportQuantity * this.unitPrice;
        this.tax = this.price * toGetTax(this.firstChar, this.lastChar) / 100;
    }

    private long toGetExportQuantity(String firstChar) {
        if (firstChar.equals("A"))
            return 6;
        return 7;
    }

    private long toGetUnitPrice(String lastChar) {
        if (lastChar.equals("Y"))
            return 110000;
        return 135000;
    }

    private long toGetTax(String firstChar, String lastChar) {
        if (firstChar.equals("A") && lastChar.equals("Y"))
            return 8;
        else if (firstChar.equals("A") && lastChar.equals("N"))
            return 11;
        else if (firstChar.equals("B") && lastChar.equals("Y"))
            return 17;
        return 22;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %d %d %d", this.ID, this.importQuantity, this.exportQuantity, this.unitPrice, this.price, this.tax);
    }
}
