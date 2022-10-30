package Object_Array.J05024;

public class Student {
    private String ID;
    private String fullName;
    private String className;
    private String email;
    private String courseName;
    private String major;

    public Student(String ID, String fullName, String className, String email) {
        this.ID = ID;
        this.fullName = fullName;
        this.className = className;
        this.email = email;
        this.courseName = className.substring(0, 1);
        this.major = ID.substring(5, 7);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return this.ID + " " + this.fullName + " " + this.className + " " + this.email;
    }
}
