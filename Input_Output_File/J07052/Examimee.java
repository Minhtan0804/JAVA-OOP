package Input_Output_File.J07052;

public class Examimee implements Comparable<Examimee> {
    private String examimeeID;
    private String examimeeName;
    private double priorPoint;
    private double totalPoint;
//    private String status;

    public Examimee(String examimeeID, String examimeeName, double mathPoint, double physicsPoint, double chemistryPoint) {
        this.examimeeID = examimeeID;
        this.examimeeName = capitalize(examimeeName);
        this.priorPoint = toPriorPoint(examimeeID);
        this.totalPoint = mathPoint * 2 + physicsPoint + chemistryPoint + this.priorPoint;
    }

    public double getTotalPoint() {
        return totalPoint;
    }

    public double toPriorPoint(String examimeeID) {
        if (examimeeID.startsWith("KV1"))
            return 0.5;
        else if (examimeeID.startsWith("KV2"))
            return 1.0;
        return 2.5;
    }

    public String capitalize(String examimeeName){
        String[] str = examimeeName.toLowerCase().trim().split("\\s+");
        StringBuilder res = new StringBuilder();

        for (String temp : str) {
            res.append(temp.substring(0, 1).toUpperCase()).append(temp.substring(1)).append(" ");
        }

        return res.toString();
    }

    @Override
    public int compareTo(Examimee o) {
        if (this.totalPoint < o.totalPoint)
            return 1;
        else if (this.totalPoint == o.totalPoint && this.examimeeID.compareTo(o.examimeeID) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        String result = this.examimeeID + " " + this.examimeeName;
        if (this.priorPoint == (int) this.priorPoint)
            result += String.format("%.0f ", this.priorPoint);
        else
            result += String.format("%.1f ", this.priorPoint);

        if (this.totalPoint == (int) this.totalPoint)
            result += String.format("%.0f ", this.totalPoint);
        else
            result += String.format("%.1f ", this.totalPoint);

        return result;
    }
}
