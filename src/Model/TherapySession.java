package Model;

import java.time.LocalDate;

public class TherapySession {
    private LocalDate sessionDate;
    private int durationInMinutes;
    private String sessionNotes;

    public TherapySession(LocalDate sessionDate, int durationInMinutes, String sessionNotes) {
        this.sessionDate = sessionDate;
        this.durationInMinutes = durationInMinutes;
        this.sessionNotes = sessionNotes;
    }

    // Getters and setters for session fields
    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getSessionNotes() {
        return sessionNotes;
    }

    public void setSessionNotes(String sessionNotes) {
        this.sessionNotes = sessionNotes;
    }

    // Other methods specific to therapy sessions, if needed
    // ...
}
