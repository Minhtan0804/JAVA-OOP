package Input_Output_File.J07053;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Candidate {
    private final static AtomicInteger count = new AtomicInteger(0);
    private String candidateID;
    private String fullName;
    private Date dateOfBirth;
    private double theoryScore;
    private double practieScore;
    private double rewardPoint;
    private int age;
    private double avergeScore;
    private String classify;

    public Candidate(String fullName, String dateOfBirth, String theoryScore, String practieScore) throws Exception {
        this.candidateID = String.format("PH%02d", count.incrementAndGet());
        this.fullName = capitalize(fullName);
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        this.theoryScore = Float.parseFloat(theoryScore);
        this.theoryScore = Float.parseFloat(theoryScore);
        this.practieScore = Float.parseFloat(practieScore);
        this.rewardPoint = toGetRewardPoint(this.theoryScore, this.practieScore);
        this.age = toGetAge(dateOfBirth);
        this.avergeScore = toGetAverageScore(this.theoryScore, this.practieScore, this.rewardPoint);
        this.classify = toGetClassify(this.avergeScore);
    }

    private int toGetAge(String dateOfBirth) {
        String[] str = dateOfBirth.split("/");
        return 2021 - Integer.parseInt(str[2]);
    }

    private String toGetClassify(double avergeScore) {
        if (avergeScore >= 9)
            return "Xuat sac";
        else if (avergeScore >= 8)
            return "Gioi";
        else if (avergeScore >= 7)
            return "Kha";
        else if (avergeScore >= 5)
            return "Trung binh";

        return "Truot";
    }

    private double toGetAverageScore(double theoryScore, double practieScore, double rewardPoint) {
        double score = (int) Math.round((theoryScore + practieScore) / 2 + rewardPoint);
        if (score >= 10)
            return 10.0;
        return score;
    }

    private double toGetRewardPoint(double theoryScore, double practieScore) {
        if (theoryScore >= 8 && practieScore >= 8)
            return 1.0;
        else if (theoryScore >= 7.5 && practieScore >= 7.5)
            return 0.5;

        return 0;
    }

    public String capitalize(String examimeeName){
        String[] str = examimeeName.toLowerCase().trim().split("\\s+");
        StringBuilder res = new StringBuilder();

        for (String temp : str)
            res.append(temp.substring(0, 1).toUpperCase())
                    .append(temp.substring(1)).append(" ");

        return res.toString();
    }

    @Override
    public String toString() {
        return String.format("%s %s%d %.0f %s", this.candidateID, this.fullName, this.age, this.avergeScore, this.classify);
    }
}
