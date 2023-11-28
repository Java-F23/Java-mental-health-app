package View;

import Controller.TherapySessionController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class TherapySessionView extends JPanel {
    private JTextField dateField;
    private JTextField durationField;
    private JTextArea notesArea;
    private JButton addSessionButton;

    private TherapySessionController controller;

    public TherapySessionView() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        JLabel dateLabel = new JLabel("Session Date (YYYY-MM-DD):");
        dateField = new JTextField(15);

        JLabel durationLabel = new JLabel("Duration (minutes):");
        durationField = new JTextField(15);

        JLabel notesLabel = new JLabel("Session Notes:");
        notesArea = new JTextArea(5, 20);

        addSessionButton = new JButton("Add Session");
        addSessionButton.addActionListener(new AddSessionListener());

        inputPanel.add(dateLabel);
        inputPanel.add(dateField);
        inputPanel.add(durationLabel);
        inputPanel.add(durationField);
        inputPanel.add(notesLabel);
        inputPanel.add(new JScrollPane(notesArea));
        inputPanel.add(addSessionButton);

        add(inputPanel, BorderLayout.NORTH);

        controller = new TherapySessionController(this);
    }

    public LocalDate getSessionDate() {
        return LocalDate.parse(dateField.getText());
    }

    public int getSessionDuration() {
        return Integer.parseInt(durationField.getText());
    }

    public String getSessionNotes() {
        return notesArea.getText();
    }

    private class AddSessionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.addTherapySession();
        }
    }
}

