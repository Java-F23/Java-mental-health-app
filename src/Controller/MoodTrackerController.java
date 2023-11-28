package Controller;

import Model.MoodTracker;
import Model.Patient;
import View.MoodTrackerView;

public class MoodTrackerController {
    private final MoodTrackerView view;
    private final MoodTracker model;

    public MoodTrackerController(MoodTrackerView view) {
        this.view = view;
        this.model = new MoodTracker();
    }

    public void addMoodData() {
        String patientName = view.getPatientName();
        String mood = view.getMood();

        // Assuming the Patient object exists or can be retrieved
        Patient patient = new Patient(patientName, 25, "1234567890");

        model.addMoodDataPoint(patient, mood);
        view.displayOutput("Mood added for " + patientName + ": " + mood);
    }

    // Other methods for controller functionalities
    // ...
}

