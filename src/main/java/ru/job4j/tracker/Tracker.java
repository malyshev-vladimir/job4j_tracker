package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        int counter = 0;
        Item[] result = new Item[size];
        for (int index = 0; index < size; index++) {
            if (items[index] != null) {
                result[index - counter] = items[index];
            } else {
                counter++;
            }
        }
        return Arrays.copyOf(result, size - counter);
    }

    public Item[] findByName(String name) {
        Item[] rsl = new Item[size];
        int counter = 0;
        for (int index = 0; index < size; index++) {
            if (name.equals(items[index].getName())) {
                rsl[counter] = items[index];
                counter++;
            }
        }
        return Arrays.copyOf(rsl, counter);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}