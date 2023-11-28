package Model;

import java.util.HashMap;
import java.util.Map;

public class ResearchSurvey {
    private Map<String, String[]> surveyQuestions; // Map of survey questions and response options

    public ResearchSurvey() {
        surveyQuestions = new HashMap<>();
        // Initialize survey questions and response options
        // Example:
        surveyQuestions.put("Question 1", new String[]{"Option A", "Option B", "Option C"});
        surveyQuestions.put("Question 2", new String[]{"Yes", "No"});
        // Add more questions as needed...
    }

    public Map<String, String[]> getSurveyQuestions() {
        return surveyQuestions;
    }

    // Method to categorize survey responses based on conditions
    public String categorizeResponse(String question, String response) {
        // Perform categorization based on question and response
        // Example:
        if (question.equals("Question 1")) {
            if (response.equals("Option A")) {
                return "Category X";
            } else if (response.equals("Option B")) {
                return "Category Y";
            } else if (response.equals("Option C")) {
                return "Category Z";
            }
        } else if (question.equals("Question 2")) {
            if (response.equals("Yes")) {
                return "Positive Response";
            } else if (response.equals("No")) {
                return "Negative Response";
            }
        }
        // Handle other cases if needed...

        return "Uncategorized"; // Default category
    }
}
