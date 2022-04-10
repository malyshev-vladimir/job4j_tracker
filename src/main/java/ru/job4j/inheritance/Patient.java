package ru.job4j.inheritance;

public class Patient {
    private String name;
    private String surname;
    private int patientNumber;
    private boolean haveOperation = false;

    public Patient(String name, String surname, int patientNumber, boolean haveOperation) {
    }

    public void changeOperationStatus() {
        haveOperation = true;
    }
}