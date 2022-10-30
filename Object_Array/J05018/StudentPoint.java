package Object_Array.J05018;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class StudentPoint implements Comparable<StudentPoint> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;
    private String fullName;
    private String fullPoint;
    private float averagePoint;
    public String rank;



    public StudentPoint(String fullName, String fullPoint) {
        this.ID = count.incrementAndGet();
        this.fullName = fullName;
        this.fullPoint = fullPoint;
        this.averagePoint = toPoint(fullPoint);
        this.rank = toRanhking(this.averagePoint);
    }

    public float toPoint(String fullPoint) {
        String[] point = fullPoint.split("\\s+");
        double temp = 0;

        for (String i : point)
            temp += Float.valueOf(i);

        temp += Float.valueOf(point[0]) + Float.valueOf(point[1]);
        return (float) (Math.round(temp / 12 * 10.0) / 10.0);
    }

    public String toRanhking(float averagePoint) {
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
        return String.format("HS%02d %s %.1f %s", this.ID, this.fullName, this.averagePoint, this.rank);
    }
}
