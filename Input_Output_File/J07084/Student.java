package Input_Output_File.J07084;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student> {
    private String fullName;
    private Date timeStart;
    private Date timeFinish;
    private int time;

    public Student(String fullName, String timeStart, String timeFinish) throws Exception {
        this.fullName = fullName;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.timeStart = simpleDateFormat.parse(timeStart);
        this.timeFinish = simpleDateFormat.parse(timeFinish);
        this.time = (int) ((this.timeFinish.getTime() - this.timeStart.getTime()) / 60000);
    }

    @Override
    public int compareTo(Student o) {
        if (this.time < o.time)
            return 1;
        if (this.time == o.time && this.fullName.compareTo(o.fullName) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.fullName, this.time);
    }
}
