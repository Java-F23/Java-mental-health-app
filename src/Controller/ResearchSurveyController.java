package Controller;

import Model.ResearchSurvey;
import View.ResearchSurveyView;

import java.util.Map;

public class ResearchSurveyController {
    private final ResearchSurveyView view;
    private final ResearchSurvey model;

    public ResearchSurveyController(ResearchSurveyView view) {
        this.view = view;
        this.model = new ResearchSurvey();
    }

    public String[] getSurveyResponseOptions(String question) {
        return model.getSurveyQuestions().get(question);
    }

    public void handleSurveyResponse(String question, String response) {
        try {
            // Process the survey response (e.g., categorize based on conditions)
            String category = model.categorizeResponse(question, response);
            System.out.println("Response categorized as: " + category);
            // Perform further operations...
        } catch (Exception e) {
            // Handle incomplete survey submission
            e.printStackTrace();
        }
    }
}
