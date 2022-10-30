package Input_Output_File.J07054;

import java.util.concurrent.atomic.AtomicInteger;

public class Student implements Comparable<Student> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String studentID;
    private String studenName;
    private double firstPoint;
    private double secondPoint;
    private double thirdPoint;
    private double averagePoint;

    public Student(String studenName, String firstPoint, String secondPoint, String thirdPoint) {
        this.studentID = String.format("SV%02d", count.incrementAndGet());
        this.studenName = capitalize(studenName);
        this.firstPoint = Double.parseDouble(firstPoint) * 3;
        this.secondPoint = Double.parseDouble(secondPoint) * 3;
        this.thirdPoint = Double.parseDouble(thirdPoint) * 2;
        double num = (this.firstPoint + this.secondPoint + this.thirdPoint) / 8 * 100;
        this.averagePoint = Math.round(num) / (double) 100;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public String capitalize(String studenName){
        String[] str = studenName.toLowerCase().trim().split("\\s+");
        StringBuilder res = new StringBuilder();

        for (String temp : str) {
            res.append(temp.substring(0, 1).toUpperCase()).append(temp.substring(1)).append(" ");
        }

        return res.toString();
    }

    @Override
    public int compareTo(Student o) {
       if (this.averagePoint < o.averagePoint)
           return 1;
       else if (this.averagePoint == o.averagePoint && this.studentID.compareTo(o.studentID) > 0)
           return 1;
       return -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f ", this.studentID, this.studenName, this.averagePoint);
    }
}
