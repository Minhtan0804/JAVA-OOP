package Input_Output_File.J07010;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;
    private String studentCode;
    private String fullName;
    private String className;
    private Date dateOfBirth;
    private float GPA;

    public Student(String fullName, String className, String dateOfBirth, float GPA) throws ParseException {
        this.ID = count.incrementAndGet();
        this.studentCode = "B20DCCN" + String.format("%03d", this.ID);
        this.fullName = fullName;
        this.className = className;
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return this.studentCode + " " + this.fullName + " " + this.className + " " + new SimpleDateFormat("dd/MM/yyyy").format(this.dateOfBirth) + " " + String.format("%.2f", this.GPA);
    }
}
