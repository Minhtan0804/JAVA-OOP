package Relationship_Between_Class.J06008;

import java.util.ArrayList;

public class Teacher {
    private String teacherID;
    private String teacherName;

    private double timeOfTeach;

    private ArrayList<Class> classList;

    public Teacher(String teacherID, String teacherName) {
        this.teacherID = teacherID;
        this.teacherName = teacherName.substring(1);
        this.timeOfTeach = 0;
        this.classList = new ArrayList<>();
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTimeOfTeach(double timeOfTeach) {
        this.timeOfTeach += timeOfTeach;
    }

    public void setClassList(Class clas) {
        this.classList.add(clas);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Giang vien: ")
                .append(this.teacherName)
                .append("\n");
        for (Class clas : this.classList)
            res.append(clas);

        res.append("Tong: ").append(String.format("%.2f", this.timeOfTeach));

        return res.toString();
    }
}
