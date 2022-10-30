package Class_and_Object.J07058;

public class Exam implements Comparable<Exam> {
    private String subjectCode;
    private String subjcetName;
    private String examForm;

    public Exam(String subjectCode, String subjcetName, String examForm) {
        this.subjectCode = subjectCode;
        this.subjcetName = subjcetName;
        this.examForm = examForm;
    }

    @Override
    public int compareTo(Exam o) {
        return this.subjectCode.compareTo(o.subjectCode) > 0 ? 1 : -1;
    }

    @Override
    public String toString() {
        return subjectCode + " " + subjcetName + " " + examForm;
    }
}
