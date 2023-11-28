package Controller;

import Model.Patient;
import Model.SupportGroup;
import View.SupportGroupView;

import java.util.ArrayList;
import java.util.List;

public class SupportGroupController {
    private final SupportGroupView view;
    private final SupportGroup supportGroup;
    private final List<Patient> participants;

    public SupportGroupController(SupportGroupView view) {
        this.view = view;
        this.supportGroup = new SupportGroup();
        this.participants = new ArrayList<>();
    }

    public void addParticipant() {
        // Assuming patient data is available or can be retrieved
        Patient participant = new Patient("Participant Name", 30, "Contact Info");
        participants.add(participant);
        updateParticipantDisplay();
    }

    public void updateParticipantDisplay() {
        StringBuilder participantsInfo = new StringBuilder();
        for (Patient participant : participants) {
            participantsInfo.append(participant.getName()).append("\n");
        }
        view.displayParticipants(participantsInfo.toString());
    }

    public void conductDiscussion() {
        supportGroup.setDiscussionTopic(view.getDiscussionTopic());
        for (Patient participant : participants) {
            supportGroup.addParticipant(participant);
        }
        supportGroup.conductGroupDiscussion();
    }
}
