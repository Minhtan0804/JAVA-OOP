package Relationship_Between_Class.J06003;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int groupID;
    private String exerciseName;
    private List<Student> studentList;

    public Exercise(String exerciseName) {
        this.groupID = count.incrementAndGet();
        this.exerciseName = exerciseName;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getGroupID() {
        return groupID;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Bai tap dang ky: " + this.exerciseName;
    }
}
