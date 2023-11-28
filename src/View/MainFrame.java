package View;

import Model.ProgressTracker;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTabbedPane tabbedPane;
    public MainFrame() {
        setTitle("Mental Health Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600, 900); // Adjust the window size as needed

        tabbedPane = new JTabbedPane();

        // Create instances of each view
        PatientView patientView = new PatientView();
        TherapySessionView therapySessionView = new TherapySessionView();
        MoodTrackerView moodTrackerView = new MoodTrackerView();
        MedicationTrackerView medicationTrackerView = new MedicationTrackerView();

        ProgressTrackerView progressTrackerView = new ProgressTrackerView(new ProgressTracker().getMilestones());
        SupportGroupView supportGroupView = new SupportGroupView();
        EducationalResourceView educationalResourceView = new EducationalResourceView();
        TreatmentPlanView treatmentPlanView = new TreatmentPlanView();
        // ResearchSurveyView researchSurveyView = new ResearchSurveyView();
        // ...

        // Add each view as a tab
        tabbedPane.addTab("Patient", patientView);
        tabbedPane.addTab("Therapy Session", therapySessionView);
        tabbedPane.addTab("Mood Tracker", moodTrackerView);
        tabbedPane.addTab("Medication Tracker", medicationTrackerView);
        tabbedPane.addTab("Progress Tracker", progressTrackerView);
        tabbedPane.addTab("Support Groups",supportGroupView);
        tabbedPane.addTab("Educational Resources", educationalResourceView);
        tabbedPane.addTab("Treatment Plans", treatmentPlanView);
        //tabbedPane.addTab("Research Survey", researchSurveyView);
        // ...

        add(tabbedPane);
        setVisible(true);
    }
}
