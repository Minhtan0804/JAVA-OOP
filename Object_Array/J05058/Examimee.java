package Object_Array.J05058;

public class Examimee implements Comparable<Examimee> {
    private String ID, FullName, Status;
    private double pMath, pPthysics, pChemistry, pPriorty, pTotal, pTest;

    public Examimee(String ID, String fullName,
                    double pMath, double pPthysics, double pChemistry) {
        this.ID = ID;
        this.FullName = fullName;
        this.Status = Status;
        this.pMath = pMath;
        this.pPthysics = pPthysics;
        this.pChemistry = pChemistry;

        if (this.ID.charAt(2) == '1')
            this.pPriorty = 0.5;
        else if (this.ID.charAt(2) == '2')
            this.pPriorty = 1;
        else
            this.pPriorty = 2.5;

        this.pTotal = this.pMath * 2 + this.pPthysics + this.pChemistry;

        if (this.pTotal + this.pPriorty >= 24)
            this.Status = "TRUNG TUYEN";
        else
            this.Status = "TRUOT";

        this.pTest = this.pPriorty + this.pTotal;

    }

    @Override
    public int compareTo(Examimee o) {
        if (this.pTest < o.pTest)
            return 1;
        else if (this.pTest == o.pTest && this.ID.compareTo(o.ID) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        String res = String.format("%s %s ", this.ID, this.FullName);

        if (this.pPriorty == (int) this.pPriorty)
            res += String.format("%.0f ", this.pPriorty);
        else
            res += String.format("%.1f ", this.pPriorty);

        if (this.pTest == (int) this.pTest)
            res += String.format("%.0f ", this.pTest);
        else
            res += String.format("%.1f ", this.pTest);

        res += this.Status;
        return res;
    }
}
