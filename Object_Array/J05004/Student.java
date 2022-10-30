package Object_Array.J05004;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int ID;
    private String fullName;
    private String className;
    private String dateOfBirth;
    private final double GPA;

    public Student(String fullName, String className, String dateOfBirth, double GPA) {
        this.ID = count.incrementAndGet();
        this.fullName = fullName;
        this.className = className;
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }

    public void capitalize() {
        String[] str = this.fullName.trim().toLowerCase().split("\\s+");

        String res = "";
        for (String i : str) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }

        this.fullName = res;
    }

    @Override
    public String toString() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
            Date date = simpleDateFormat.parse(this.dateOfBirth);
            this.dateOfBirth = simpleDateFormat.format(date);
        } catch (Exception e){
            /* TO DO: handle exceptuon. */
        }
        capitalize();
        return String.format("B20DCCN%03d %s%s %s %.2f", this.ID, this.fullName,
                this.className, this.dateOfBirth, this.GPA);
    }
}
