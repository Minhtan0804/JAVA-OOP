package Contest_2.DanhSachThiICPC;

import java.util.concurrent.atomic.AtomicInteger;

public class Team {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String teamID;
    private String teamName;
    private String schoolName;

    public Team(String teamName, String schoolName) {
        this.teamID = String.format("Team%02d", count.incrementAndGet());
        this.teamName = teamName;
        this.schoolName = schoolName;
    }

    public String getTeamID() {
        return teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return this.teamName + " " + this.schoolName;
    }
}
