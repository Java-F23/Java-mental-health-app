package View;

import Controller.ProgressTrackerController;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ProgressTrackerView extends JPanel {
    private JComboBox<String> milestoneComboBox;
    private JButton updateButton;

    private ProgressTrackerController controller;

    public ProgressTrackerView(List<String> milestones) {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(1, 2));

        milestoneComboBox = new JComboBox<>(milestones.toArray(new String[0]));
        inputPanel.add(new JLabel("Milestone Achieved:"));
        inputPanel.add(milestoneComboBox);

        updateButton = new JButton("Update Progress");
        updateButton.addActionListener(e -> updateProgress());
        add(inputPanel, BorderLayout.CENTER);
        add(updateButton, BorderLayout.SOUTH);

        controller = new ProgressTrackerController(this);
    }

    private void updateProgress() {
        String milestoneAchieved = (String) milestoneComboBox.getSelectedItem();
        controller.handleProgressUpdate(milestoneAchieved);
    }
}

