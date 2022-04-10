package ru.job4j.inheritance;

public class Tooth {

    private int toothNumber;
    private boolean needToBeTreated = false;
    private boolean needToBeRemoved = false;

    public Tooth(int toothNumber, boolean needToBeTreated, boolean needToBeRemoved) {
        this.toothNumber = toothNumber;
        this.needToBeTreated = needToBeTreated;
        this.needToBeRemoved = needToBeRemoved;
    }

    public void heal(Tooth tooth) {
        if (tooth.needToBeTreated) {
            tooth.needToBeTreated = false;
        }
    }

    public static void pullOut(Tooth tooth) {
        if (tooth.needToBeRemoved) {
            tooth.needToBeRemoved = false;
        }
    }
}
