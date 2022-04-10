package ru.job4j.inheritance;

public class Doctor extends Profession {

    private int doctorsLicenseNumber;

    public Doctor(String name, String surname, String education, String birthday, int doctorsLicenseNumber) {
        super(name, surname, education, birthday);
        this.doctorsLicenseNumber = doctorsLicenseNumber;
    }

    public int getDoctorsLicenseNumber() {
        return doctorsLicenseNumber;
    }

    public int renewDoctorLicense(int doctorsLicenseNumber) {
        this.doctorsLicenseNumber = doctorsLicenseNumber;
        return doctorsLicenseNumber;
    }
}