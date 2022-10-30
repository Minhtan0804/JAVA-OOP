package Contest_2.ThucTapCoSo;

public class Student {
    private String studentID;
    private String fullName;
    private String phoneNumber;
    private String email;

    public Student(String studentID, String fullName, String phoneNumber, String email) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return this.studentID + " " + this.fullName + " " + this.phoneNumber + " " + this.email;
    }
}
