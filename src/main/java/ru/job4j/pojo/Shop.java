package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int indexOfNull = -1;
        for (int index = 0; index < products.length; index++) {
            if (products[index] == null) {
                indexOfNull = index;
                break;
            }
        }
        return indexOfNull;
    }
}