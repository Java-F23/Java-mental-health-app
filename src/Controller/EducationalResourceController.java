package Controller;

import Model.Database;
import Model.EducationalResource;
import View.EducationalResourceView;

import java.time.LocalDate;

public class EducationalResourceController {
    private final EducationalResourceView view;
    private Database database = new Database();

    EducationalResource educationalResource = new EducationalResource();

    public EducationalResourceController(EducationalResourceView view) {
        super();
        this.view = view;
    }

    public void saveEducationalResource(String title, String content, LocalDate publicationDate) {
        // Create an EducationalResource object with the provided data
        EducationalResource resource = new EducationalResource(title, content, publicationDate);

        //  saving to database
        database.addEducationalResource(educationalResource);
        System.out.println("Resource Saved to Database "+educationalResource.getTitle()+ " - "+educationalResource.getContent());

    }
}

