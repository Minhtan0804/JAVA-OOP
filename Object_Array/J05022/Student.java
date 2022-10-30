package Object_Array.J05022;

public class Student {
    private String ID;
    private String fullName;
    private String className;
    private String email;

    public Student(String ID, String fullName, String className, String email) {
        this.ID = ID;
        this.fullName = fullName;
        this.className = className;
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return this.ID + " " + this.fullName + " " + this.className + " " + this.email;
    }
}
