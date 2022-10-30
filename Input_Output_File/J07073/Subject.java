package Input_Output_File.J07073;

public class Subject implements Comparable<Subject> {
    private String subjectID;
    private String subjectName;
    private int numOfCredits;
    private String theoreticalTeach;
    private String praticalTeach;

    public Subject(String subjectID, String subjectName, int numOfCredits, String theoreticalTeach, String praticalTeach) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.numOfCredits = numOfCredits;
        this.theoreticalTeach = theoreticalTeach;
        this.praticalTeach = praticalTeach;
    }

    public String getPraticalTeach() {
        return praticalTeach;
    }

    @Override
    public int compareTo(Subject o) {
        return this.subjectID.compareTo(o.subjectID) > 0 ? 1 : -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s %s", this.subjectID, this.subjectName, this.numOfCredits, this.theoreticalTeach, this.praticalTeach);
    }
}
