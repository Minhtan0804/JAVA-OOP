package Input_Output_File.J07037;

public class Enterprise implements Comparable<Enterprise> {
    private String enterpriseCode;
    private String enterpriseName;
    private int numOfStudent;

    public Enterprise(String enterpriseCode, String enterpriseName, int numOfStudent) {
        this.enterpriseCode = enterpriseCode;
        this.enterpriseName = enterpriseName;
        this.numOfStudent = numOfStudent;
    }

    @Override
    public int compareTo(Enterprise o) {
        return this.enterpriseCode.compareTo(o.enterpriseCode) > 0 ? 1 : -1;
    }

    @Override
    public String toString() {
        return this.enterpriseCode + " " + this.enterpriseName + " " + String.format("%d", this.numOfStudent);
    }
}
