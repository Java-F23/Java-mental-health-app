package Controller;

import Model.TherapySession;
import View.TherapySessionView;

import java.time.LocalDate;

public class TherapySessionController {
    private final TherapySessionView view;

    public TherapySessionController(TherapySessionView view) {
        this.view = view;
    }

    public void addTherapySession() {
        LocalDate sessionDate = view.getSessionDate();
        int duration = view.getSessionDuration();
        String notes = view.getSessionNotes();

        TherapySession therapySession = new TherapySession(sessionDate, duration, notes);

        // Here you might handle the storage or processing of the therapy session object.
        // For example, you could store it in a list or perform other operations based on your application's needs.
        System.out.println("New Therapy Session Added:\nDate: " + sessionDate +
                "\nDuration: " + duration + " minutes\nNotes: " + notes);
    }
}

