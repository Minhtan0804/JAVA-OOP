package Contest_2.ThucTapCoSo;

import java.util.concurrent.atomic.AtomicInteger;

public class Topic implements Comparable<Topic> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String topicID;
    private String teacherName;
    private String topicName;

    public Topic(String teacherName, String topicName) {
        this.topicID = String.format("DT%3d", count.incrementAndGet());
        this.teacherName = teacherName;
        this.topicName = topicName;
    }

    public String getTopicID() {
        return topicID;
    }

    @Override
    public int compareTo(Topic o) {
        return this.topicName.compareTo(o.topicName) > 0 ? 1 : -1;
    }

    @Override
    public String toString() {
        return this.teacherName + " " + this.topicName;
    }
}
