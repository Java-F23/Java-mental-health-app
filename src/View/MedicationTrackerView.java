package View;

import Controller.MedicationTrackerController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MedicationTrackerView extends JPanel {
    private JTextField patientNameField;
    private JTextField medicationNameField;
    private JTextField dosageField;
    private JTextField frequencyField;
    private JButton addMedicationButton;
    private class AddMedicationListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.addMedicationRecord();
        }
    }


    private MedicationTrackerController controller;

    public MedicationTrackerView() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));

        JLabel patientLabel = new JLabel("Patient Name:");
        patientNameField = new JTextField(15);

        JLabel medicationLabel = new JLabel("Medication Name:");
        medicationNameField = new JTextField(15);

        JLabel dosageLabel = new JLabel("Dosage:");
        dosageField = new JTextField(15);

        JLabel frequencyLabel = new JLabel("Usage Frequency:");
        frequencyField = new JTextField(15);

        addMedicationButton = new JButton("Add Medication");
        addMedicationButton.addActionListener(new AddMedicationListener());

        inputPanel.add(patientLabel);
        inputPanel.add(patientNameField);
        inputPanel.add(medicationLabel);
        inputPanel.add(medicationNameField);
        inputPanel.add(dosageLabel);
        inputPanel.add(dosageField);
        inputPanel.add(frequencyLabel);
        inputPanel.add(frequencyField);
        inputPanel.add(addMedicationButton);

        add(inputPanel, BorderLayout.NORTH);

        controller = new MedicationTrackerController(this);
    }

    public String getPatientName() {
        return patientNameField.getText();
    }

    public String getMedicationName() {
        return medicationNameField.getText();
    }

    public String getDosage() {
        return dosageField.getText();
    }

    public String getUsageFrequency() {
        return frequencyField.getText();
    }

    // Other methods for displaying feedback or information from the controller
    // ...
}

