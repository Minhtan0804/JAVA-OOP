package Object_Array.J05054;

import java.util.concurrent.atomic.AtomicInteger;

public class Student implements Comparable<Student> {
    private final static AtomicInteger count = new AtomicInteger(0);
    private String studentID;
    private String studentName;
    private float averagePoint;
    private String classify;
    private int rank;

    public Student(String studentName, float averagePoint) {
        this.studentID = String.format("HS%02d", count.incrementAndGet());
        this.studentName = studentName;
        this.averagePoint = averagePoint;
        this.classify = toGetClassify(averagePoint);
    }

    private String toGetClassify(float averagePoint) {
        if (averagePoint >= 9)
            return "Gioi";
        else if (averagePoint >= 7)
            return "Kha";
        else if (averagePoint >= 5)
            return "Trung Binh";
        return "Yeu";
    }

    public String getStudentID() {
        return studentID;
    }

    public float getAveragePoint() {
        return averagePoint;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Student o) {
        if (this.averagePoint < o.averagePoint)
            return 1;
        return -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s %d", this.studentID, this.studentName, this.averagePoint, this.classify, this.rank);
    }
}
