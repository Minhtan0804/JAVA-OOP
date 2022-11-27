package Object_Array.J05057;

public class Examimee {
    private String ID, FullName, Status;
    private double pMath, pPthysics, pChemistry, pPriorty, pTotal;

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


    }

    @Override
    public String toString() {
        String res = String.format("%s %s ", this.ID, this.FullName);

        if (this.pPriorty == (int) this.pPriorty)
            res += String.format("%.0f ", this.pPriorty);
        else
            res += String.format("%.1f ", this.pPriorty);

        if (this.pTotal == (int) this.pTotal)
            res += String.format("%.0f ", this.pTotal);
        else
            res += String.format("%.1f ", this.pTotal);

        res += this.Status;
        return res;
    }
}
