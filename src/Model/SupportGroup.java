package Model;

import java.util.ArrayList;
import java.util.List;

public class SupportGroup {
    private List<Patient> participants;
    private String discussionTopic;

    public SupportGroup() {
        participants = new ArrayList<>();
    }

    public void addParticipant(Patient participant) {
        participants.add(participant);
    }

    public void setDiscussionTopic(String topic) {
        discussionTopic = topic;
    }

    public void conductGroupDiscussion() {
        int participantCount = participants.size();

        if (participantCount < 5) {
            System.out.println("Insufficient participants for a group discussion.");
            return;
        }

        // Conduct discussion based on the topic using switch statement
        switch (discussionTopic.toLowerCase()) {
            case "anxiety":
                System.out.println("Discussing anxiety-related topics...");
                // Logic for discussing anxiety topics
                break;
            case "depression":
                System.out.println("Discussing depression-related topics...");
                // Logic for discussing depression topics
                break;
            case "stress management":
                System.out.println("Discussing stress management...");
                // Logic for stress management discussion
                break;
            default:
                System.out.println("No specific topic selected for discussion.");
                break;
        }
    }
}
