package Input_Output_File.J07051;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Guest implements Comparable<Guest> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String guestID;
    private String guestName;
    private int roomCode;
    private Date dayCheckIn;
    private Date dayCheckOut;
    private int serviceFee;
    private int day;
    private int dayFee;
    private long totalFee;

    public Guest(String guestName, int roomCode, String dayCheckIn, String dayCheckOut, int serviceFee) throws ParseException {
        this.guestID = String.format("KH%02d", count.incrementAndGet());
        this.guestName = capitalize(guestName);
        this.roomCode = roomCode;
        this.serviceFee = serviceFee;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.dayCheckIn = simpleDateFormat.parse(dayCheckIn);
        this.dayCheckOut = simpleDateFormat.parse(dayCheckOut);
        this.day = (int) ((this.dayCheckOut.getTime() - this.dayCheckIn.getTime())/86400000 + 1);
        this.dayFee = getDayFee(roomCode);
        this.totalFee = this.dayFee * this.day + serviceFee;
    }

    public int getDayFee(int roomCode) {
        if (roomCode / 100 == 1)
            return 25;
        else if (roomCode / 100 == 2)
            return 34;
        else if (roomCode / 100 == 3)
            return 50;

        return 80;
    }

    public String capitalize(String guestName){
        String[] str = guestName.toLowerCase().trim().split("\\s+");
        String res = "";

        for (String temp : str) {
            res += temp.substring(0, 1).toUpperCase() + temp.substring(1) + " ";
        }

        return res;
    }

    @Override
    public int compareTo(Guest o) {
        return this.totalFee < o.totalFee ? 1 : -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d", this.guestID, this.guestName, this.roomCode, this.day, this.totalFee);
    }
}