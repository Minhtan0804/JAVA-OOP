package Relationship_Between_Class.J06008;

import java.util.List;

public class Teacher {
    private String teacherID;
    private String teacherName;

    private List<Subject> subjectList;

    public Teacher(String teacherID, String teacherName) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setSubjectList(Subject subject) {
        this.subjectList.add(subject);
    }
}
