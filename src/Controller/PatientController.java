package Controller;

import Model.Database;
import Model.Patient;
import View.PatientView;


import javax.swing.*;

public class PatientController {
    private final Patient model;
    Database database = new Database();
    public PatientController(PatientView view, Patient model) {
        this.model = model;
        view.setController(this);
    }

    public void savePatient(String name, int age, String contactInfo) {
        // Validate contact info
        if (model.validateContactInfo(contactInfo)){
            // set values and save to file
            model.setName(name);
            model.setAge(age);
            model.setContactInfo(contactInfo);
            database.addPatient(model);
            // print details
            System.out.println("Patient details saved: " + model.getName() + ", " + model.getAge() + ", " + model.getContactInfo());

        } else {
            System.out.println("Invalid email or phone number");
        }



    }
    


    public static void main(String[] args) {
        Patient model = new Patient();
        PatientView view = new PatientView();
        PatientController controller = new PatientController(view, model);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(view);
        frame.pack();
        frame.setVisible(true);
    }
}
