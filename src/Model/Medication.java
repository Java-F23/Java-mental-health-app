package Model;

public class Medication {
    private String medicationName;
    private String dosage;
    private String usageFrequency;

    public Medication(String medicationName, String dosage, String usageFrequency) {
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.usageFrequency = usageFrequency;
    }

    // Getters and setters for medication details

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getUsageFrequency() {
        return usageFrequency;
    }

    public void setUsageFrequency(String usageFrequency) {
        this.usageFrequency = usageFrequency;
    }
}
