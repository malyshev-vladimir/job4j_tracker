package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemDescByNameTest {
    @Test
    public void whenListDescByName() {
        List<Item> items = new ArrayList<>();
        Item item1 = new Item(1, "sdgqwg");
        Item item2 = new Item(2, "nernbfv");
        Item item3 = new Item(3, "myngv");
        Item item4 = new Item(4, "pmuthh");
        Item item5 = new Item(5, "eucghggef");
        Item item6 = new Item(6, "rynwtnb");
        Item item7 = new Item(7, "kfwefg");
        Item item8 = new Item(8, "modfgve");
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);

        Collections.sort(items, new ItemDescByName());

        List<Item> expected = new ArrayList<>();
        expected.add(item1);
        expected.add(item6);
        expected.add(item4);
        expected.add(item2);
        expected.add(item3);
        expected.add(item8);
        expected.add(item7);
        expected.add(item5);

        assertEquals(expected, items);
    }
}