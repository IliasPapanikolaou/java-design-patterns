package com.unipi.ipap.javadesignpatterns.adapter.fooddelivery;

import java.util.ArrayList;
import java.util.List;

public class DeliveryStore {

    private final List<Item> items = new ArrayList<>();

    public void addItems(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return this.items;
    }
}
