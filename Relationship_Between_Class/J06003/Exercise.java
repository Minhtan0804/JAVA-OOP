package Relationship_Between_Class.J06003;

import java.util.concurrent.atomic.AtomicInteger;

public class Exercise {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int groupID;
    private String exerciseName;

    public Exercise(String exerciseName) {
        this.groupID = count.incrementAndGet();
        this.exerciseName = exerciseName;
    }

    public int getGroupID() {
        return groupID;
    }

    @Override
    public String toString() {
        return "Bai tap dang ky: " + this.exerciseName;
    }
}
