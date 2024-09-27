package com.mploed.cohesion.sequential.packageexample;

import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
    private Set<Item> items = new HashSet<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Set<Item> getItems() {
        return items;
    }
}
