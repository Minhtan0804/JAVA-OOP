package Input_Output_File.J07081;

public class Student implements Comparable<Student> {
    private String studentID;
    private String fullName;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Student(String studentID, String fullName, String phoneNumber, String email) {
        this.studentID = studentID;
        this.fullName = fullName;
        String[] str = fullName.trim().split("\\s+");
        this.firstName = str[0];
        String temp = "";
        for (int i = 1; i < str.length - 1 ; i++)
            temp += str[i] + " ";
        this.middleName = temp;
        this.lastName = str[str.length - 1];
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public int compareTo(Student o) {
        if (this.lastName.compareTo(o.lastName) > 0)
            return 1;
        if (this.lastName.compareTo(o.lastName) == 0 && this.firstName.compareTo(o.firstName) > 0)
            return 1;
        if (this.lastName.compareTo(o.lastName) == 0 && this.firstName.compareTo(o.firstName) == 0 && this.middleName.compareTo(o.middleName) > 0)
            return 1;
        if (this.fullName.compareTo(o.fullName) == 0 && this.studentID.compareTo(o.studentID) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.studentID, this.fullName, this.phoneNumber, this.email);
    }
}
