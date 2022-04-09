package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    String hospital;

    public Surgeon(String name, String surname, String education, String birthday, int doctorsLicenseNumber, String hospital) {
        super(name, surname, education, birthday, doctorsLicenseNumber);
        this.hospital = hospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void doOperation(Patient patient) {
        patient.haveOperation = true;
    }
}