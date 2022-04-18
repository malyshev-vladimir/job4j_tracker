package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public boolean replace(int id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            items[index] = item;
            item.setId(id);
            result = true;
        }
        return result;
    }

    public boolean delete(int id) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {

            System.arraycopy(items, index + 1, items, index, size - index - 1);
            result = true;
            size--;
        }
        return result;
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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }
}