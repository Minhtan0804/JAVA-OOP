package Object_Array.J05011;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Gamer implements Comparable<Gamer> {
    private String ID;
    private String fullName;
    private String timeIn;
    private String timeOut;
    private String timePlay;
    private int diff;

    public Gamer(String ID, String fullName, String timeIn, String timeOut) {
        this.ID = ID;
        this.fullName = fullName;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    public void calcTime() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

            Date dateIn = simpleDateFormat.parse(this.timeIn);
            Date dateOut = simpleDateFormat.parse(this.timeOut);

            this.diff = (int) (dateOut.getTime()-dateIn.getTime()) / 60000 ;
            int hour = this.diff / 60;
            int minutes = this.diff % 60;
            this.timePlay = String.valueOf(hour) + " gio " + String.valueOf(minutes) + " phut";
        } catch (Exception e) {

        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.ID, this.fullName, this.timePlay);
    }

    @Override
    public int compareTo(Gamer o) {
        return this.diff < o.diff ? 1 : -1;
    }
}
