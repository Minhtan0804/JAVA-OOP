package Object_Array.J05031;

public class SheetPoint implements Comparable<SheetPoint> {
    private int ID;
    private String studentCode;
    private String fullName;
    private String className;
    private double firstPoint;
    private double secondPoint;
    private double thirdPoint;

    public SheetPoint(String studentCode, String fullName, String className,
                      double firstPoint, double secondPoint, double thirdPoint) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.className = className;
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int compareTo(SheetPoint o) {
        if (this.fullName.compareTo(o.fullName) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %s %.1f %.1f %.1f", this.ID,
                this.studentCode, this.fullName, this.className,
                this.firstPoint, this.secondPoint, this.thirdPoint);
    }
}
