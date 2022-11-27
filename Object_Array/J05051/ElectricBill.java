package Object_Array.J05051;

import java.util.concurrent.atomic.AtomicInteger;

public class ElectricBill implements Comparable<ElectricBill> {
    private final static AtomicInteger count = new AtomicInteger(0);
    private String typeUser;
    private long oldIndex;
    private long newIndex;
    private String userID;
    private long factor;
    private long intoMoney;
    private long surcharge;
    private long payMoney;

    public ElectricBill(String typeUser, long oldIndex, long newIndex) {
        this.typeUser = typeUser;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.userID = String.format("KH%02d", count.incrementAndGet());
        this.factor = toGetFactor(typeUser);
        this.intoMoney = (newIndex - oldIndex) * this.factor * 550;
        this.surcharge = Math.round(toGetSurcharge(newIndex - oldIndex) * this.intoMoney / 100.0);
        this.payMoney = this.intoMoney + this.surcharge;
    }

    private long toGetSurcharge(long i) {
        if (i > 100)
            return 100;
        else if (i >=50)
            return 35;
        return 0;
    }

    private long toGetFactor(String typeUser) {
        switch (typeUser) {
            case "KD":
                return 3;
            case "NN":
                return 5;
            case "TT":
                return 4;
        }

        return 2;
    }

    @Override
    public int compareTo(ElectricBill o) {
        return (int) (o.payMoney - this.payMoney);
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %d %d", this.userID, this.factor, this.intoMoney, this.surcharge, this.payMoney);
    }
}
