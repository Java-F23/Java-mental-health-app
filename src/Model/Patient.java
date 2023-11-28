package Model;

import java.util.regex.Pattern;

public class Patient  {


    private String name;
    private int age;
    private String contactInfo;
    Database database = new Database();

    public Patient(String name, int age, String contactInfo) {
        this.name = name;
        this.age = age;
        if (validateContactInfo(contactInfo)) {
            this.contactInfo = contactInfo;

            database.addPatient(this);
        }
        else {
            System.out.println("Invalid email or phone number");
        }

    }

    public Patient() {

        this.name = "";
        this.age = 0;
        this.contactInfo = "";
    }

    public Object[] getPatients() {
        return database.getAllPatients();
    }

    // Getters and setters for patient fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        if (validateContactInfo(contactInfo)) {
            this.contactInfo = contactInfo;
        }
        else {
            System.out.println("Invalid email or phone number");
        }

    }

    // Validate contact information format using regular expressions (either email of phone number)
    public boolean validateContactInfo(String c) {
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String phoneRegex = "^\\d{10}$"; // Considering a simple 10-digit phone number

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        return emailPattern.matcher(c).matches() || phonePattern.matcher(c).matches();
    }

    // StringBuilder for efficient string manipulation
    public String generatePatientInfoString() {
        StringBuilder infoBuilder = new StringBuilder();
        infoBuilder.append("Name: ").append(name).append("\n")
                .append("Age: ").append(age).append("\n")
                .append("Contact Info: ").append(contactInfo);

        return infoBuilder.toString();
    }
}
