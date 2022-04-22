package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() { }

    @Override
    public void passengers(int passengers) { }

    @Override
    public double refuel(int fuelQuantity) {
        double gasolinePricePerLiter = 2.467;
        return fuelQuantity * gasolinePricePerLiter;
    }
}