package View;

import Controller.EducationalResourceController;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class EducationalResourceView extends JPanel {
    private JTextField titleField;
    private JTextArea contentArea;
    private JTextField publicationDateField;
    private JButton saveButton;

    private EducationalResourceController controller;

    public EducationalResourceView() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField(15);

        JLabel contentLabel = new JLabel("Content:");
        contentArea = new JTextArea(5, 20);
        contentArea.setLineWrap(true);
        JScrollPane contentScrollPane = new JScrollPane(contentArea);

        JLabel publicationDateLabel = new JLabel("Publication Date (YYYY-MM-DD):");
        publicationDateField = new JTextField(15);

        saveButton = new JButton("Save");
        saveButton.addActionListener(e -> saveResource());

        inputPanel.add(titleLabel);
        inputPanel.add(titleField);
        inputPanel.add(contentLabel);
        inputPanel.add(contentScrollPane);
        inputPanel.add(publicationDateLabel);
        inputPanel.add(publicationDateField);
        inputPanel.add(saveButton);

        add(inputPanel, BorderLayout.CENTER);

        controller = new EducationalResourceController(this);
    }

    private void saveResource() {
        String title = titleField.getText();
        String content = contentArea.getText();
        String dateText = publicationDateField.getText();

        // Parse date string to LocalDate (Assuming input format: YYYY-MM-DD)
        LocalDate publicationDate = LocalDate.parse(dateText);

        controller.saveEducationalResource(title, content, publicationDate);
    }
}
