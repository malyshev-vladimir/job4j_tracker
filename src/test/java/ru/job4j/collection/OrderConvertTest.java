package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenDuplicate() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        orders.add(new Order("1uyt", "Skirt"));
        orders.add(new Order("3sfe", "T-Shirt"));
        orders.add(new Order("9ygf", "Shoes"));
        orders.add(new Order("6brf", "Coat"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertEquals(4, map.size());
    }
}