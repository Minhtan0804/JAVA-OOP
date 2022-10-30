package Class_and_Object.J04005;

import java.util.Scanner;

class ThiSinh  {
    private String fullName, dateBirth;
    private float score_1, score_2, score_3;

    public ThiSinh () {

    }

    public ThiSinh (String fullName, String dateBirth,
                   float score_1, float score_2, float score_3) {
        this.fullName = fullName;
        this.dateBirth = dateBirth;
        this.score_1 = score_1;
        this.score_2 = score_2;
        this.score_3 = score_3;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getScore_1() {
        return score_1;
    }

    public void setScore_1(float score_1) {
        this.score_1 = score_1;
    }

    public float getScore_2() {
        return score_2;
    }

    public void setScore_2(float score_2) {
        this.score_2 = score_2;
    }

    public float getScore_3() {
        return score_3;
    }

    public void setScore_3(float score_3) {
        this.score_3 = score_3;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f", fullName,
                dateBirth, score_1 + score_2 + score_3);
    }
}

public class KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh thiSinh = new ThiSinh();
        thiSinh.setFullName(sc.nextLine());
        thiSinh.setDateBirth(sc.nextLine());
        thiSinh.setScore_1(sc.nextFloat());
        thiSinh.setScore_2(sc.nextFloat());
        thiSinh.setScore_3(sc.nextFloat());

        System.out.println(thiSinh);
    }
}
