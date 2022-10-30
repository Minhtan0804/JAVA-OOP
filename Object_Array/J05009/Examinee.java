package Object_Array.J05009;

import java.util.concurrent.atomic.AtomicInteger;

public class Examinee implements Comparable<Examinee> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;
    private String fullName;
    private String dateOfBirth;
    private double point1;
    private double point2;
    private double point3;
    private double totalPoint;

    public Examinee(String fullName, String dateOfBirth, double point1,
                    double point2, double point3) {
        this.ID = count.incrementAndGet();
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.totalPoint = point1 + point2 + point3;
    }

    public double getTotalPoint() {
        return totalPoint;
    }

    @Override
    public int compareTo(Examinee o) {
        if (this.totalPoint < o.totalPoint)
            return 1;
        if (this.totalPoint == o.totalPoint && this.ID > o.ID)
            return 1;

        return -1;

    }

    @Override
    public String toString() {
        return String.format("%d %s %s %.1f", this.ID, this.fullName,
                this.dateOfBirth, this.totalPoint);
    }
}
