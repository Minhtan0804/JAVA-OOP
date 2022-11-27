package Java_Collection.J08011;

public class Number implements Comparable<Number> {
    private String num;
    private int count;

    public Number(String num, int count) {
        this.num = num;
        this.count = count;
    }

    @Override
    public int compareTo(Number o) {
        if (this.count < o.count)
            return 1;
        else if (this.count == o.count && this.num.compareTo(o.num) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return this.num + " " + this.count;
    }
}
