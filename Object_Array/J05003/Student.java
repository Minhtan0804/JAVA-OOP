package Object_Array.J05003;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int ID;
    private final String fullName;
    private final String className;
    private String dateOfBirth;
    private final double GPA;

    public Student() {
        this.ID = 0;
        this.fullName = "";
        this.className = "";
        this.dateOfBirth = "";
        this.GPA = 0;
    }

    public Student(String fullName, String className, String dateOfBirth, double GPA) {
        this.ID = count.incrementAndGet();
        this.fullName = fullName;
        this.className = className;
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
            Date date = simpleDateFormat.parse(this.dateOfBirth);
            this.dateOfBirth = simpleDateFormat.format(date);
        } catch (Exception e) {
            /* TO DO: handle exceptuon. */
        }
        return String.format("B20DCCN%03d %s %s %s %.2f", this.ID, this.fullName,
                this.className, this.dateOfBirth, this.GPA);
    }
}
