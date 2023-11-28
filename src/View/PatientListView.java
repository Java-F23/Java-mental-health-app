package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


import Model.Patient;


public class PatientListView extends JPanel {
    private JTable patientTable;
    private JButton backButton;
    Patient patient = new Patient();
    String[] columnNames = {"Name", "Age", "Contact Info"};
    public PatientListView() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        patientTable = new JTable();
        // Load patient data from file and populate table
        getAllPatients(patient.getPatients());

        JScrollPane scrollPane = new JScrollPane(patientTable);
        add(scrollPane);

        backButton = new JButton("Back");
        backButton.addActionListener(e -> {

            showPreviousView(); // Handle navigation back to the previous view
        });
        add(backButton);
    }

    private void showPreviousView() {
        // Handle navigation back to the previous view (PatientView)

        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            frame.getContentPane().removeAll();

            frame.getRootPane().add(new MainFrame());

            frame.revalidate();
            frame.repaint();
        }
    }

    private void getAllPatients(Object[] objects) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) patientTable.getModel();
        defaultTableModel.setColumnIdentifiers(columnNames);
        int i = 0;
        while(i < objects.length) {
            String row = objects[i].toString().trim();
            String[] rows = row.split(",");
            defaultTableModel.addRow(rows);
            i++;
        }
    }
}
