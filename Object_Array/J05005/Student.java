package Object_Array.J05005;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Student implements Comparable<Student>{
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String fullName;
    private String className;
    private String dateOfBirth;
    private double GPA;

    public Student(String fullName, String className, String dateOfBirth, double GPA) {
        this.id = count.incrementAndGet();
        this.fullName = fullName;
        this.className = className;
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }

    public void convertName() {
//        String tmp = this.fullName.trim();
        String[] str = this.fullName.trim().toLowerCase().split("\\s+");

        String res = "";
        for (String i : str) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }

        this.fullName = res;
    }

    public void convertDay() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
            Date date = simpleDateFormat.parse(this.dateOfBirth);
            this.dateOfBirth = simpleDateFormat.format(date);
        } catch (Exception e) {

        }
    }

    @Override
    public int compareTo(Student o) {
        return this.GPA < o.GPA ? 1 : -1;
    }

    @Override
    public String toString() {
        convertDay();
        convertName();
        return String.format("B20DCCN%03d %s%s %s %.2f", this.id, this.fullName,
                this.className, this.dateOfBirth, this.GPA);
    }
}
