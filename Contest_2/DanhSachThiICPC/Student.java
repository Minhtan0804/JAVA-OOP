package Contest_2.DanhSachThiICPC;

import java.util.concurrent.atomic.AtomicInteger;

public class Student implements Comparable<Student> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String studentID;
    private String studentName;
    private String teamID;

    public Student(String studentName, String teamID) {
        this.studentID = String.format("C%03d", count.incrementAndGet());
        this.studentName = studentName;
        this.teamID = teamID;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentName.compareTo(o.studentName) > 0 ? 1 : -1;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTeamID() {
        return teamID;
    }

    @Override
    public String toString() {
        return this.studentID + " " + this.studentName;
    }
}
