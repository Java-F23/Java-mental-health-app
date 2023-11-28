package Controller;

import Model.ProgressTracker;
import View.ProgressTrackerView;

import javax.swing.*;


public class ProgressTrackerController {
    private final ProgressTrackerView view;
    private final ProgressTracker model;
    public static class ProgressUpdateException extends Exception {
        public ProgressUpdateException(String message) {
            super(message);
        }
    }

    public ProgressTrackerController(ProgressTrackerView view) {
        this.view = view;
        this.model = new ProgressTracker();
    }

    public void handleProgressUpdate(String milestoneAchieved) {
        try {
            model.updateProgress(milestoneAchieved);
        } catch (ProgressUpdateException e) {
            // Handle exception related to progress update
            e.printStackTrace();
            // For example: show an error message to the user
            JOptionPane.showMessageDialog(view, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

