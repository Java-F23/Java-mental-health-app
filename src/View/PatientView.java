package View;

import Controller.PatientController;
import Model.Patient;

import javax.swing.*;



public class PatientView extends JPanel {
    private JButton showAllPatientsButton;
    private final JTextField nameField;
    private final JTextField ageField;
    private final JTextField contactInfoField;

    private PatientController controller = new PatientController(this, new Patient());

    public PatientView() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        nameField = new JTextField(20);
        ageField = new JTextField(5);
        contactInfoField = new JTextField(20);
        JButton saveButton = new JButton("Save");


        saveButton.addActionListener(e -> {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String contactInfo = contactInfoField.getText();

            controller.savePatient(name, age, contactInfo);
        });

        showAllPatientsButton = new JButton("Show All Patients");
        showAllPatientsButton.addActionListener(e -> {
            showAllPatients(); // Show the list of patients view
        });


        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Age:"));
        add(ageField);
        add(new JLabel("Contact Info:"));
        add(contactInfoField);
        add(saveButton);
        add(showAllPatientsButton);
    }

    public void setController(PatientController controller) {
        this.controller = controller;
    }

    private void showAllPatients() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(new PatientListView());
            frame.revalidate();
            frame.repaint();
        }
    }
}

