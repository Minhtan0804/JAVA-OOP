package Relationship_Between_Class.J06008;

public class Subject {
   private String subjectID;
   private String subjectName;

    public Subject() {
    }

    public Subject(String subjectID, String subjectName) {
        this.subjectID = subjectID;
        this.subjectName = subjectName.substring(1);
    }

    public String getSubjectID() {
        return subjectID;
    }

    @Override
    public String toString() {
        return this.subjectName;
    }
}
