package Model;

import java.io.*;

public class Database {

    private final String patientFileName = "src//Database//patientRecords.txt";
    private final String medicationFileName = "src//Database//medicationRecords.txt";
    private final String educationalResourceFileName = "src//Database//educationalResources.txt";
    private final String moodTrackerFileName = "src//Database//moodTrackerRecords.txt";
    private final String progressTrackerFileName = "src//Database//progressTrackerRecords.txt";
    private final String researchSurveyFileName = "src//Database//researchSurveyRecords.txt";
    private final String supportGroupFileName = "src//Database//supportGroupRecords.txt";
    private final String therapySessionFileName = "src//Database//therapySessionRecords.txt";
    private final String treatmentPlanFileName = "src//Database//treatmentPlanRecords.txt";

    public Database() {
        createFileIfNotExists(patientFileName);
        createFileIfNotExists(medicationFileName);
        createFileIfNotExists(educationalResourceFileName);
        createFileIfNotExists(moodTrackerFileName);
        createFileIfNotExists(progressTrackerFileName);
        createFileIfNotExists(researchSurveyFileName);
        createFileIfNotExists(supportGroupFileName);
        createFileIfNotExists(therapySessionFileName);
        createFileIfNotExists(treatmentPlanFileName);
    }
    private void createFileIfNotExists(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    // Methods for saving and loading data for each class

    public void addPatient(Patient patient) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(patientFileName, true))) {
            writer.write(patient.getName() + ", " + patient.getAge() + ", " + patient.getContactInfo());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addEducationalResource(EducationalResource educationalResource) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(educationalResourceFileName, true))) {
            writer.write(educationalResource.getTitle() + ", " + educationalResource.getContent() + ", " + educationalResource.getPublicationDate());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addMedication(Medication medication){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(medicationFileName, true))) {
            writer.write(medication.getMedicationName() + ", " + medication.getDosage()+ ", " + medication.getUsageFrequency());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public Object[] getAllPatients() {
        Object[] objects;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(patientFileName));
            objects = bufferedReader.lines().toArray();
            bufferedReader.close();
            return objects;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void clearPatientsFile() {
        try (PrintWriter writer = new PrintWriter(patientFileName)) {
            writer.print("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
