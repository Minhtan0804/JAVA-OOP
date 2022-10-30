package Relationship_Between_Class.J06007;

public class Subject {
    private String subjectID;
    private String subjectName;
    private double hour;

    public Subject(String subject) {
        String[] str = subject.split("\\s+");
        this.subjectID = str[0];
        String temp = "";
        for (int i = 1; i < str.length; i++) {
            temp += str[i] + " ";
        }
        this.subjectName = temp;
        this.hour = 0;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public double getHour() {
        return hour;
    }
}
