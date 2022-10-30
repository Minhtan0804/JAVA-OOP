package Object_Array.J05033;

public class Time implements Comparable<Time> {
    private final int hour;
    private final int minnute;
    private final int second;

    public Time(int hour, int minnute, int second) {
        this.hour = hour;
        this.minnute = minnute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%d %d %d", this.hour,
                this.minnute, this.second);
    }

    @Override
    public int compareTo(Time o) {
        if (this.hour > o.hour)
            return 1;
        if (this.hour == o.hour && this.minnute > o.minnute)
            return 1;
        if (this.hour == o.hour && this.minnute == o.minnute
                && this.second > o.second)
            return 1;

        return -1;
    }
}