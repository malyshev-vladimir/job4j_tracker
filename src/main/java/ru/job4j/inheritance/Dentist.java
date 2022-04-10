package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String dentalClinic;

    public Dentist(String name, String surname, String education, String birthday, int doctorsLicenseNumber, String dentalClinic) {
        super(name, surname, education, birthday, doctorsLicenseNumber);
        this.dentalClinic = dentalClinic;
    }

    public String getDentalClinic() {
        return dentalClinic;
    }

    public void pullOut(Tooth tooth) {
        Tooth.pullOut(tooth);
    }

    public void heal(Tooth tooth) {

    }
}