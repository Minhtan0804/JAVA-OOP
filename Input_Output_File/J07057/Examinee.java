package Input_Output_File.J07057;

import java.util.concurrent.atomic.AtomicInteger;

public class Examinee implements Comparable<Examinee> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String examineeID;
    private String examineeName;
    private float testPoint;
    private String ethnic;
    private int area;
    private float totalPoint;
    private String status;

    public Examinee(String examineeName, float testPoint, String ethnic, int area) {
        this.examineeID = String.format("TS%02d", count.incrementAndGet());
        this.examineeName = capitalize(examineeName);
        this.testPoint = testPoint;
        this.ethnic = ethnic;
        this.area = area;
        this.totalPoint = testPoint + getTotalPoint(area, ethnic);
        this.status = getStatus(this.totalPoint);
    }

    public static String capitalize(String str) {
        String[] s = str.trim().toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            result.append(s[i].substring(0, 1).toUpperCase()).append(s[i].substring(1)).append(" ");
        }
        return result.toString();
    }

    public static float getTotalPoint(int area, String ethnic) {
        float bonusPoint = 0;
        if (area == 1)
            bonusPoint += 1.5;
        else if (area == 2)
            bonusPoint += 1;

        if (!ethnic.equals("Kinh"))
            bonusPoint += 1.5;

        return bonusPoint;
    }

    public static String getStatus(float point) {
        if (point >= 20.5)
            return "Do";

        return "Truot";
    }

    @Override
    public int compareTo(Examinee o) {
        if (this.totalPoint < o.totalPoint)
            return 1;
        if (this.totalPoint == o.totalPoint && this.examineeID.compareTo(o.examineeID) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", this.examineeID, this.examineeName, this.totalPoint, this.status);
    }
}
