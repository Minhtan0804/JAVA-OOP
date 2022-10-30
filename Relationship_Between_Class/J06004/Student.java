package Relationship_Between_Class.J06004;

public class Student implements Comparable<Student> {
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
    public int compareTo(Student o) {
        return this.studentID.compareTo(o.studentID) > 0 ? 1 : -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", this.studentID, this.studentName, this.phoneNumber, this.groupID);
    }
}
