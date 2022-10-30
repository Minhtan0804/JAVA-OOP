package Relationship_Between_Class.J06007;

public class Teacher {
    private String teacherID;
    private String teacherName;
    private double hour;

    public Teacher(String teacher) {
        String[] str = teacher.split("\\s+");
        this.teacherID = str[0];
        String temp = "";
        for (int i = 1; i < str.length; i++) {
            temp += str[i] + " ";
        }
        this.teacherName = temp;
        this.hour = 0;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return String.format("%s%.2f", this.teacherName, this.hour);
    }
}
