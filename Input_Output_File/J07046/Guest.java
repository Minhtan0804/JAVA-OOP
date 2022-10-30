package Input_Output_File.J07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Guest implements Comparable<Guest>{
    private static final AtomicInteger count = new AtomicInteger(0);
    private String ID;
    private String fullName;
    private String roomCode;
    private Date dayCheckIn;
    private Date dayCheckOut;
    private int day;

    public Guest(String fullName, String roomCode, String dayCheckIn, String dayCheckOut) throws ParseException {
        this.ID = "KH" + String.format("%02d", count.incrementAndGet());
        this.fullName = fullName;
        this.roomCode = roomCode;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.dayCheckIn = simpleDateFormat.parse(dayCheckIn);
        this.dayCheckOut = simpleDateFormat.parse(dayCheckOut);
        this.day = (int) ((this.dayCheckOut.getTime() - this.dayCheckIn.getTime()) / 86400000);
    }

    @Override
    public int compareTo(Guest o) {
        if (this.day < o.day)
            return 1;
        return -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", this.ID, this.fullName, this.roomCode, this.day);
    }
}
