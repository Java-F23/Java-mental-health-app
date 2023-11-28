package Model;

import Controller.ProgressTrackerController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgressTracker {
    private final List<String> milestones;

    public ProgressTracker() {
        milestones = new ArrayList<>();
        // Initialize milestones if needed
        // Example:
        Collections.addAll(milestones, "Milestone 1", "Milestone 2", "Milestone 3");
    }

    public List<String> getMilestones() {
        return Collections.unmodifiableList(milestones); // Return an unmodifiable list
    }

    // Method to update progress data
    public void updateProgress(String milestoneAchieved) throws ProgressTrackerController.ProgressUpdateException {
        // Check if the milestone achieved is valid
        if (!milestones.contains(milestoneAchieved)) {
            throw new ProgressTrackerController.ProgressUpdateException("Invalid milestone achieved: " + milestoneAchieved);
        }

        // If milestone achieved is valid, update progress data
        // Example: perform progress update operation...
        System.out.println("Progress updated: " + milestoneAchieved);
    }
}

