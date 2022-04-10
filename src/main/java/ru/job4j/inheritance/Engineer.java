package ru.job4j.inheritance;

public class Engineer extends Profession {

    private int engineersLicenseNumber;

    public Engineer(String name, String surname, String education, String birthday, int engineersLicenseNumber) {
        super(name, surname, education, birthday);
        this.engineersLicenseNumber = engineersLicenseNumber;
    }

    public int getEngineersLicenseNumber() {
        return engineersLicenseNumber;
    }

    public int renewEngineersLicense(int engineersLicenseNumber) {
        this.engineersLicenseNumber = engineersLicenseNumber;
        return engineersLicenseNumber;
    }
}