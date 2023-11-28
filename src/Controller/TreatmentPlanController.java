package Controller;

import Model.TreatmentPlan;
import View.TreatmentPlanView;

public class TreatmentPlanController {
    private final TreatmentPlanView view;

    public TreatmentPlanController(TreatmentPlanView view) {
        this.view = view;
    }

    public void modifyTreatmentPlan(String goals, String therapyOptions, String medicationRecommendations) {
        try {
            // Update the TreatmentPlan object or perform operations based on modifications
            TreatmentPlan plan = new TreatmentPlan(goals, therapyOptions, medicationRecommendations);

            // For example: updateDatabase(plan);
        } catch (Exception e) {
            // Handle exceptions related to treatment plan modifications
            e.printStackTrace();
        }
    }
}

