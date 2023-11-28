package Model;

import java.time.LocalDate;

public class EducationalResource {
    private String title;
    private String content;
    private LocalDate publicationDate;

    public EducationalResource(String title, String content, LocalDate publicationDate) {
        this.title = title;
        this.content = content;
        this.publicationDate = publicationDate;
    }

    public EducationalResource() {
        this.title = "title";
        this.content = "content";
        this.publicationDate = null;
    }
    // Getters and setters for the fields

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }
}
