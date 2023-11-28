package Controller;

import Model.Medication;
import Model.MedicationTracker;
import Model.Patient;
import View.MedicationTrackerView;

public class MedicationTrackerController {
    private final MedicationTrackerView view;
    private final MedicationTracker model;

    public MedicationTrackerController(MedicationTrackerView view) {
        this.view = view;
        this.model = new MedicationTracker();
    }

    public void addMedicationRecord() {
        String patientName = view.getPatientName();
        String medicationName = view.getMedicationName();
        String dosage = view.getDosage();
        String usageFrequency = view.getUsageFrequency();

        // Create a Patient object with the patient's name (assume patient data is available or can be retrieved)
        Patient patient = new Patient(patientName, 25, "Contact Info");

        // Create a Medication object
        Medication medication = new Medication(medicationName, dosage, usageFrequency);

        // Add medication record for the patient
        model.addMedicationRecord(patient, medication);

        // Display success message or perform other actions based on the application's needs
        // ...
    }

    // Other controller methods for interacting with the model or updating the view
    // ...
}
