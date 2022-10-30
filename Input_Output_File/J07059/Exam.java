package Input_Output_File.J07059;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Exam implements Comparable<Exam> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String testID;
    private Date testDay;
    private String testRoom;

    public Exam(String day, String hour, String testRoom) throws Exception {
        this.testID = "C" + String.format("%03d", count.incrementAndGet());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        this.testDay = dateFormat.parse(day + " " + hour);
        this.testRoom = testRoom;
    }

    @Override
    public int compareTo(Exam o) {
        if (this.testDay.getTime() > o.testDay.getTime())
            return 1;
        if (this.testDay.getTime() == o.testDay.getTime() && this.testID.compareTo(o.testID) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return String.format("%s %s %s", this.testID, dateFormat.format(this.testDay), this.testRoom);
    }
}
