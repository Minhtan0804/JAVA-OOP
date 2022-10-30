package Relationship_Between_Class.J06003;

public class Student {
    private String studentID;
    private String studentName;
    private String phoneNumber;
    private int groupID;

    public Student(String studentID, String studentName, String phoneNumber, int groupID) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
        this.groupID = groupID;
    }

    public int getGroupID() {
        return groupID;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.studentID, this.studentName, this.phoneNumber);
    }
}
