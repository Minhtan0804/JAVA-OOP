package Relationship_Between_Class.J06004;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Group {
    private String groupTopic;

    public Group(String groupTopic) {
        this.groupTopic = groupTopic;
    }

    public String getGroupTopic() {
        return groupTopic;
    }

    @Override
    public String toString() {
        return groupTopic;
    }
}
