package Object_Array.J05021;

public class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student o) {
        if (this.ID.compareTo(o.ID) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return this.ID + " " + this.fullName + " " + this.className + " " + this.email;
    }
}
