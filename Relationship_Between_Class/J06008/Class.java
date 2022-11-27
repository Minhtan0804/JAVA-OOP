package Relationship_Between_Class.J06008;

public class Class {
    private Teacher teacher;
    private Subject subject;
    private double time;

    public Class(Teacher teacher, Subject subject, double time) {
        this.teacher = teacher;
        this.subject = subject;
        this.time = time;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return this.subject + " " + this.time + "\n";
    }
}
