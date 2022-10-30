package Input_Output_File.J07055;

import java.util.concurrent.atomic.AtomicInteger;

public class Student implements Comparable<Student> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String studentID;
    private String studenName;
    private int trainPoint;
    private int practicePoint;
    private int examPoint;
    private double averagePoint;
    private String status;

    public Student(String studenName, String trainPoint, String practicePoint, String examPoint) {
        this.studentID = String.format("SV%02d", count.incrementAndGet());
        this.studenName = capitalize(studenName);
        this.trainPoint = Integer.parseInt(trainPoint);
        this.practicePoint = Integer.parseInt(practicePoint);
        this.examPoint = Integer.parseInt(examPoint);
        this.averagePoint = this.trainPoint * 0.25 + this.practicePoint * 0.35 + this.examPoint * 0.4;
        this.status = getStatus(averagePoint);
    }

    public String capitalize(String studenName){
        String[] str = studenName.toLowerCase().trim().split("\\s+");
        StringBuilder res = new StringBuilder();

        for (String temp : str) {
            res.append(temp.substring(0, 1).toUpperCase()).append(temp.substring(1)).append(" ");
        }

        return res.toString();
    }

    private static String getStatus(double averagePoint) {
        if (averagePoint >= 8)
            return "GIOI";
        else if (averagePoint >= 6.5)
            return "KHA";
        else if (averagePoint >= 5)
            return "TRUNG BINH";
        return "KEM";
    }

    @Override
    public int compareTo(Student o) {
        return this.averagePoint < o.averagePoint ? 1 : -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %s", this.studentID, this.studenName, this.averagePoint, this.status);
    }
}
