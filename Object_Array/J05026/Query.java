package Object_Array.J05026;

public class Query {
    private String subjectName;
    private String subjectCode;

    public Query(String subjectName) {
        this.subjectName = subjectName;
    }

    public void toGetSubjectCode() {
        String[] str = this.subjectName.toUpperCase().split("\\s+");
        this.subjectCode = "";
        for (String i : str)
            this.subjectCode += String.valueOf(i.charAt(0));
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }
}
