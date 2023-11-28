package View;

import Controller.ResearchSurveyController;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class ResearchSurveyView extends JPanel {
    private JComboBox<String> questionComboBox;
    private JComboBox<String> responseComboBox;
    private JButton submitButton;

    private ResearchSurveyController controller;

    public ResearchSurveyView(Map<String, String[]> surveyQuestions) {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(2, 2));

        questionComboBox = new JComboBox<>(surveyQuestions.keySet().toArray(new String[0]));
        responseComboBox = new JComboBox<>(surveyQuestions.get(questionComboBox.getSelectedItem()));

        questionComboBox.addActionListener(e -> updateResponseOptions());
        inputPanel.add(new JLabel("Question:"));
        inputPanel.add(questionComboBox);
        inputPanel.add(new JLabel("Response:"));
        inputPanel.add(responseComboBox);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> submitResponse());

        add(inputPanel, BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);

        controller = new ResearchSurveyController(this);
    }

    private void updateResponseOptions() {
        String selectedQuestion = (String) questionComboBox.getSelectedItem();
        String[] responses = controller.getSurveyResponseOptions(selectedQuestion);
        responseComboBox.setModel(new DefaultComboBoxModel<>(responses));
    }

    private void submitResponse() {
        String selectedQuestion = (String) questionComboBox.getSelectedItem();
        String selectedResponse = (String) responseComboBox.getSelectedItem();
        controller.handleSurveyResponse(selectedQuestion, selectedResponse);
    }
}
