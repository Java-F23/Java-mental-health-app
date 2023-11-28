package View;

import Controller.SupportGroupController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SupportGroupView extends JPanel {
    private JTextField topicField;
    private JTextArea participantTextArea;
    private JButton addParticipantButton;
    private JButton conductDiscussionButton;

    private SupportGroupController controller;

    public SupportGroupView() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        JLabel topicLabel = new JLabel("Discussion Topic:");
        topicField = new JTextField(15);

        JLabel participantLabel = new JLabel("Participants:");
        participantTextArea = new JTextArea(5, 20);
        participantTextArea.setEditable(false);

        addParticipantButton = new JButton("Add Participant");
        addParticipantButton.addActionListener(new AddParticipantListener());

        conductDiscussionButton = new JButton("Conduct Discussion");
        conductDiscussionButton.addActionListener(new ConductDiscussionListener());

        inputPanel.add(topicLabel);
        inputPanel.add(topicField);
        inputPanel.add(participantLabel);
        inputPanel.add(new JScrollPane(participantTextArea));
        inputPanel.add(addParticipantButton);
        inputPanel.add(conductDiscussionButton);

        add(inputPanel, BorderLayout.NORTH);

        controller = new SupportGroupController(this);
    }

    public String getDiscussionTopic() {
        return topicField.getText();
    }

    public void displayParticipants(String participants) {
        participantTextArea.setText(participants);
    }

    private class AddParticipantListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Call controller method to add participant
            controller.addParticipant();
        }
    }

    private class ConductDiscussionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Call controller method to conduct discussion
            controller.conductDiscussion();
        }
    }
}
