package Object_Array.J05023;

public class Student {
    private String ID;
    private String fullName;
    private String className;
    private String email;
    private String courseYear;

    public Student(String ID, String fullName, String className, String email) {
        this.ID = ID;
        this.fullName = fullName;
        this.className = className;
        this.email = email;
        this.courseYear = className.substring(1, 3);
    }

    public String getCourseYear() {
        return courseYear;
    }

    @Override
    public String toString() {
        return this.ID + " " + this.fullName + " " + this.className + " " + this.email;
    }
}
