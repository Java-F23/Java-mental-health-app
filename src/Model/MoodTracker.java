package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoodTracker {
    private final Map<Patient, List<String>> moodData;

    public MoodTracker() {
        moodData = new HashMap<>();
    }

    public void addMoodDataPoint(Patient patient, String mood) {
        moodData.computeIfAbsent(patient, k -> new ArrayList<>()).add(mood);
    }

    public void analyzeMoodTrend(Patient patient) {
        List<String> moodList = moodData.get(patient);
        if (moodList != null) {
            int totalMoods = moodList.size();
            if (totalMoods > 0) {
                int happyCount = 0;
                int sadCount = 0;
                int neutralCount = 0;

                for (String mood : moodList) {
                    switch (mood.toLowerCase()) {
                        case "happy":
                            happyCount++;
                            break;
                        case "sad":
                            sadCount++;
                            break;
                        case "neutral":
                            neutralCount++;
                            break;
                        // Add more mood categories if needed
                    }
                }

                // Calculate percentages of different moods
                double happyPercentage = (double) happyCount / totalMoods * 100;
                double sadPercentage = (double) sadCount / totalMoods * 100;
                double neutralPercentage = (double) neutralCount / totalMoods * 100;

                System.out.println("Mood analysis for " + patient.getName() + ":");
                System.out.println("Happy: " + happyPercentage + "%");
                System.out.println("Sad: " + sadPercentage + "%");
                System.out.println("Neutral: " + neutralPercentage + "%");
            } else {
                System.out.println("No mood data available for " + patient.getName());
            }
        } else {
            System.out.println(patient.getName() + " has no mood data.");
        }
    }

    public void analyzeOverallMoodTrend(List<Patient> patients) {
        int totalPatients = patients.size();
        int totalHappy = 0;
        int totalSad = 0;
        int totalNeutral = 0;

        for (Patient patient : patients) {
            List<String> moodList = moodData.get(patient);
            if (moodList != null) {
                for (String mood : moodList) {
                    switch (mood.toLowerCase()) {
                        case "happy":
                            totalHappy++;
                            break;
                        case "sad":
                            totalSad++;
                            break;
                        case "neutral":
                            totalNeutral++;
                            break;
                        // Add more mood categories if needed
                    }
                }
            }
        }

        // Calculate overall mood percentages
        double overallHappyPercentage = (double) totalHappy / (totalPatients * 100);
        double overallSadPercentage = (double) totalSad / (totalPatients * 100);
        double overallNeutralPercentage = (double) totalNeutral / (totalPatients * 100);

        System.out.println("Overall mood trends across patients:");
        System.out.println("Happy: " + overallHappyPercentage + "%");
        System.out.println("Sad: " + overallSadPercentage + "%");
        System.out.println("Neutral: " + overallNeutralPercentage + "%");
    }

    // Other methods for analysis or data retrieval
    // ...
}
