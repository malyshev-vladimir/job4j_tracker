package ru.job4j.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        return " ______" + System.lineSeparator()
            + "|      |" + System.lineSeparator()
            + "|      |" + System.lineSeparator()
            + "|______|" + System.lineSeparator();
    }
}