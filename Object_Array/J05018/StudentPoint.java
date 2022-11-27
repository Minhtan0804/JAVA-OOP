package Object_Array.J05018;

import java.util.concurrent.atomic.AtomicInteger;

public class StudentPoint implements Comparable<StudentPoint> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;
    private String fullName;
    private double averagePoint;
    public String rank;



    public StudentPoint(String fullName, double averagePoint) {
        this.ID = count.incrementAndGet();
        this.fullName = fullName;
        this.averagePoint = averagePoint;
        this.rank = toRanhking(this.averagePoint);
    }

    public String toRanhking(double averagePoint) {
        double point = averagePoint;
        if (point >= 9)
            return "XUAT SAC";
        else if (point >= 8)
            return "GIOI";
        else if (point >= 7)
            return "KHA";
        else if (point >= 5)
            return "TB";
        else
            return "YEU";
    }

    @Override
    public int compareTo(StudentPoint o) {
        if (this.averagePoint < o.averagePoint)
            return 1;
        if (this.averagePoint == o.averagePoint && this.ID > o.ID)
            return 1;

        return -1;

    }

    @Override
    public String toString() {
        return String.format("HS%02d ", this.ID) + " " + this.fullName + " " + this.averagePoint +  " " + this.rank;
    }
}


// (double) (Math.round(this.averagePoint * 10) / 10)