package Object_Array.J05035;

import java.util.concurrent.atomic.AtomicInteger;

public class Intern implements Comparable<Intern> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;
    private String studentID;
    private String fullName;
    private String className;
    private String email;
    private String businessCode;

    public Intern(String studentID, String fullName, String className, String email, String businessCode) {
        this.ID = count.incrementAndGet();
        this.studentID = studentID;
        this.fullName = fullName;
        this.className = className;
        this.email = email;
        this.businessCode = businessCode;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    @Override
    public int compareTo(Intern o) {
        return this.studentID.compareTo(o.studentID) > 0 ? 1 : -1;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %s %s %s", this.ID, this.studentID, this.fullName, this.className, this.email, this.businessCode);
    }
}
