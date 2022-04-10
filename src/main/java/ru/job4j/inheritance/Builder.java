package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String objectAddress;

    public Builder(String name, String surname, String education, String birthday, int engineersLicenseNumber, String objectAddress) {
        super(name, surname, education, birthday, engineersLicenseNumber);
        this.objectAddress = objectAddress;
    }

    public String getObjectAddress() {
        return objectAddress;
    }

    public void createHousePlan() {

    }
}