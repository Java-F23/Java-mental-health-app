package View;

import Controller.MoodTrackerController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoodTrackerView extends JPanel {
    private JTextField patientNameField;
    private JTextField moodField;
    private JButton addMoodButton;
    private JTextArea outputArea;

    private MoodTrackerController controller;

    public MoodTrackerView() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Patient Name:");
        patientNameField = new JTextField(15);

        JLabel moodLabel = new JLabel("Mood:");
        moodField = new JTextField(15);

        addMoodButton = new JButton("Add Mood");
        addMoodButton.addActionListener(new AddMoodListener());

        inputPanel.add(nameLabel);
        inputPanel.add(patientNameField);
        inputPanel.add(moodLabel);
        inputPanel.add(moodField);
        inputPanel.add(addMoodButton);

        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        controller = new MoodTrackerController(this);
    }

    public String getPatientName() {
        return patientNameField.getText();
    }

    public String getMood() {
        return moodField.getText();
    }

    public void displayOutput(String output) {
        outputArea.append(output + "\n");
    }

    private class AddMoodListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.addMoodData();
        }
    }
}

