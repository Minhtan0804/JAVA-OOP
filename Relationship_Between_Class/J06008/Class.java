package Relationship_Between_Class.J06008;

public class Class {
    private String teacherID;
    private String subjectID;
    private double hour;

    public Class(String s) {
        String[] str = s.split("\\s+");
        this.teacherID = str[0];
        this.subjectID = str[1];
        this.hour = Double.parseDouble(str[2]);
    }


}
