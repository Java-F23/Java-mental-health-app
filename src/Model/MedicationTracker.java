package Model;

import java.util.HashMap;
import java.util.Map;

public class MedicationTracker {
    private Map<Patient, Medication> medicationRecords;

    public MedicationTracker() {
        medicationRecords = new HashMap<>();
    }

    public void addMedicationRecord(Patient patient, Medication medication) {
        medicationRecords.put(patient, medication);
    }

    public Medication getMedicationRecord(Patient patient) {
        return medicationRecords.get(patient);
    }

    public boolean isMedicationScheduled(Patient patient) {
        return medicationRecords.containsKey(patient);
    }

    // Other methods for managing medication records, dosage adjustment, etc.
    // ...
}

