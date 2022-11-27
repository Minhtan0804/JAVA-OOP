package Relationship_Between_Class.J06004;

public class Student implements Comparable<Student> {
    private String studentID;
    private String studentName;
    private String phoneNumber;
    private int groupID;
    private Group group;

    public Student(String studentID, String studentName, String phoneNumber, int groupID) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
        this.groupID = groupID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public int compareTo(Student o) {
        return studentID.compareTo(o.studentID) > 0 ? 1 : -1;
    }

    @Override
    public String toString() {
        return studentID + " " + studentName + " " + phoneNumber +  " " + groupID + " " + group;
    }
}
