package Contest_2.ThucTapCoSo;

public class Misson {
    private String studentID;
    private String topicID;

    public Misson(String ID) {
        String[] str = ID.trim().split("\\s+");
        this.studentID = str[0];
        this.topicID = str[1];
    }

    public String getStudentID() {
        return studentID;
    }

    public String getTopicID() {
        return topicID;
    }
}
