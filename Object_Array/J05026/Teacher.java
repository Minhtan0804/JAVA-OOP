package Object_Array.J05026;

import java.util.concurrent.atomic.AtomicInteger;

public class Teacher {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;
    private String fullName;
    private String lastName;
    private String subject;
    private String subjectCode;

    public Teacher(String fullName, String subject) {
        this.ID = count.incrementAndGet();
        this.fullName = fullName;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void toGetSubjectCode() {
        String[] str = this.subject.toUpperCase().split("\\s+");
        this.subjectCode = "";
        for (String i : str)
            this.subjectCode += String.valueOf(i.charAt(0));
    }

    @Override
    public String toString() {
        return String.format("GV%02d %s %s", this.ID, this.fullName, this.subjectCode);
    }


}
