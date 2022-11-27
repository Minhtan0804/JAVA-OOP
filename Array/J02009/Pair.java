package Array.J02009;

public class Pair implements Comparable<Pair> {
    private int first;
    private int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public int compareTo(Pair o) {
        if (this.first > o.first)
            return 1;
        else if (this.first == o.first && this.second > o.second)
            return 1;

        return -1;
    }
}