package Model;

public class TreatmentPlan {
    private String treatmentGoals;
    private String therapyOptions;
    private String medicationRecommendations;

    public TreatmentPlan(String treatmentGoals, String therapyOptions, String medicationRecommendations) {
        this.treatmentGoals = treatmentGoals;
        this.therapyOptions = therapyOptions;
        this.medicationRecommendations = medicationRecommendations;
    }

    // Getters and setters for the fields

    public String getTreatmentGoals() {
        return treatmentGoals;
    }

    public void setTreatmentGoals(String treatmentGoals) {
        this.treatmentGoals = treatmentGoals;
    }

    public String getTherapyOptions() {
        return therapyOptions;
    }

    public void setTherapyOptions(String therapyOptions) {
        this.therapyOptions = therapyOptions;
    }

    public String getMedicationRecommendations() {
        return medicationRecommendations;
    }

    public void setMedicationRecommendations(String medicationRecommendations) {
        this.medicationRecommendations = medicationRecommendations;
    }
}
