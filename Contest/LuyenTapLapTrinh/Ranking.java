package Contest.LuyenTapLapTrinh;

public class Ranking implements Comparable<Ranking> {
    private int ID;
    private String fullName;
    private String sumbitAndAnswer;
    private int correctAnswer;
    private int sumbit;

    public Ranking(String fullName, String sumbitAndAnswer) {
        this.fullName = fullName;
        this.sumbitAndAnswer = sumbitAndAnswer;
        toSumbitAndAnswer();
    }

    public void toSumbitAndAnswer() {
        String[] str = this.sumbitAndAnswer.split("\\s+");
        this.correctAnswer = Integer.parseInt(str[0]);
        this.sumbit = Integer.parseInt(str[str.length -1 ]);
    }

    @Override
    public int compareTo(Ranking o) {
        if (this.correctAnswer < o.correctAnswer)
            return 1;
        else if (this.correctAnswer ==  o.correctAnswer && this.sumbit > o.sumbit)
            return 1;
        else if (this.correctAnswer ==  o.correctAnswer && this.sumbit == o.sumbit
                && this.fullName.compareTo(o.fullName) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", this.fullName, this.correctAnswer, this.sumbit);
    }
}
