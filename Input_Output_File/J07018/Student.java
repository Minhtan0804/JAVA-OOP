package Input_Output_File.J07018;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String studentID;
    private String fullName;
    private String className;
    private Date dateOfBirth;
    private double GPA;


    public Student(String fullName, String className, String dateOfBirth, double GPA) throws Exception {
        this.studentID = "B20DCCN" + String.format("%03d", count.incrementAndGet());
        this.fullName = capitalize(fullName);
        this.className = className;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.dateOfBirth = simpleDateFormat.parse(dateOfBirth);
        this.GPA = GPA;
    }

    public static String capitalize(String fullName) {
        String[] str = fullName.trim().toLowerCase().split("\\s+");
        String res = "";

        for (String s : str)
            res += s.substring(0,1).toUpperCase() + s.substring(1) + " ";

        return res;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %s%s %s %.2f", this.studentID, this.fullName, this.className, dateFormat.format(this.dateOfBirth), this.GPA);
    }
}
