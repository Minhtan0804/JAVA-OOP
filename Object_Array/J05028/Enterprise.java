package Object_Array.J05028;

public class Enterprise implements Comparable<Enterprise> {
    private int ID;
    private String businessCode;
    private String businessName;
    private int intern;

    public Enterprise(String businessCode, String businessName, int intern) {
        this.businessCode = businessCode;
        this.businessName = businessName;
        this.intern = intern;
    }

    @Override
    public int compareTo(Enterprise o) {
        if (this.intern < o.intern)
            return 1;
        if (this.intern == o.intern && this.businessCode.compareTo(o.businessCode) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", this.businessCode, this.businessName, this.intern);
    }
}
