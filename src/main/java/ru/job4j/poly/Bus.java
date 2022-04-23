package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void drive() {
        System.out.println("Этот автобус едет куда-то по дороге");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Количество пассажиров равно " + passengers + " человек");
    }

    @Override
    public double refuel(int fuelQuantity) {
        double gasolinePricePerLiter = 2.467;
        return fuelQuantity * gasolinePricePerLiter;
    }

    @Override
    public void move() {
        System.out.println("Автобус едет по дорогам");
    }
}