package Object_Array.J05025;

import java.util.concurrent.atomic.AtomicInteger;

public class Teacher implements Comparable<Teacher> {
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

    public void toGetLastName() {
        String[] str = this.fullName.split("\\s+");
        this.lastName = str[str.length - 1];
    }

    public void toGetSubjectCode() {
        String[] str = this.subject.toUpperCase().split("\\s+");
        this.subjectCode = "";
        for (String i : str)
            this.subjectCode += String.valueOf(i.charAt(0));
    }

    @Override
    public int compareTo(Teacher o) {
        if (this.lastName.compareTo(o.lastName) > 0)
            return 1;
        if (this.lastName.compareTo(o.lastName) == 0 && this.ID > o.ID)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return String.format("GV%02d %s %s", this.ID, this.fullName, this.subjectCode);
    }


}
