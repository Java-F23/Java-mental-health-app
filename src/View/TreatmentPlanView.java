package View;

import Controller.TreatmentPlanController;

import javax.swing.*;
import java.awt.*;

public class TreatmentPlanView extends JPanel {
    private JTextArea goalsArea;
    private JTextArea therapyOptionsArea;
    private JTextArea medicationRecommendationsArea;
    private JButton modifyButton;

    private TreatmentPlanController controller;

    public TreatmentPlanView() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        JLabel goalsLabel = new JLabel("Treatment Goals:");
        goalsArea = new JTextArea(5, 20);
        JScrollPane goalsScrollPane = new JScrollPane(goalsArea);

        JLabel therapyLabel = new JLabel("Therapy Options:");
        therapyOptionsArea = new JTextArea(5, 20);
        JScrollPane therapyScrollPane = new JScrollPane(therapyOptionsArea);

        JLabel medicationLabel = new JLabel("Medication Recommendations:");
        medicationRecommendationsArea = new JTextArea(5, 20);
        JScrollPane medicationScrollPane = new JScrollPane(medicationRecommendationsArea);

        modifyButton = new JButton("Modify Plan");
        modifyButton.addActionListener(e -> modifyTreatmentPlan());

        inputPanel.add(goalsLabel);
        inputPanel.add(goalsScrollPane);
        inputPanel.add(therapyLabel);
        inputPanel.add(therapyScrollPane);
        inputPanel.add(medicationLabel);
        inputPanel.add(medicationScrollPane);
        inputPanel.add(modifyButton);

        add(inputPanel, BorderLayout.CENTER);

        controller = new TreatmentPlanController(this);
    }

    private void modifyTreatmentPlan() {
        String goals = goalsArea.getText();
        String therapyOptions = therapyOptionsArea.getText();
        String medicationRecommendations = medicationRecommendationsArea.getText();

        controller.modifyTreatmentPlan(goals, therapyOptions, medicationRecommendations);
    }
}

