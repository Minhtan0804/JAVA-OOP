package Input_Output_File.J07056;

import java.util.concurrent.atomic.AtomicInteger;

public class ElectricBill implements Comparable<ElectricBill> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String clientID;
    private String fullName;
    private String familyType;
    private int firstIndex;
    private int lastIndex;
    private int index;
    private int level;
    private int billNormal;
    private int billOver;
    private int taxVAT;
    private int billPayment;

    public ElectricBill(String fullName, String familyType, String firstIndex, String lastIndex) {
        this.clientID = String.format("KH%02d", count.incrementAndGet());
        this.fullName = capitalize(fullName);
        this.familyType = familyType;
        this.firstIndex = Integer.parseInt(firstIndex.trim());
        this.lastIndex = Integer.parseInt(lastIndex.trim());
        this.index = this.lastIndex - this.firstIndex;
        this.level = getlevel(familyType);
        this.billNormal = getBillNormal(level, index);
        this.billOver = getBillOver(level, index);
        this.taxVAT = this.billOver / 20;
        this.billPayment = this.billNormal + this.billOver + this.taxVAT;
    }

    public String capitalize(String examimeeName){
        String[] str = examimeeName.toLowerCase().trim().split("\\s+");
        StringBuilder res = new StringBuilder();

        for (String temp : str) {
            res.append(temp.substring(0, 1).toUpperCase()).append(temp.substring(1)).append(" ");
        }

        return res.toString();
    }

    private static int getlevel(String familyType) {
        if (familyType.equals("C"))
            return 200;
        else if (familyType.equals("B"))
            return 500;
        else
            return 100;
    }

    private static int getBillNormal(int level, int index) {
        if (index <= level)
            return index * 450;

        return level * 450;
    }

    private static int getBillOver(int level, int index) {
        if (index > level)
            return (index - level) * 1000;

        return 0;
    }

    @Override
    public int compareTo(ElectricBill o) {
        return this.billPayment < o.billPayment ? 1 : -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", this.clientID, this.fullName, this.billNormal, this.billOver, this.taxVAT, this.billPayment);
    }
}
