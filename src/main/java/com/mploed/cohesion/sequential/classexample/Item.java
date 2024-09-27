package com.mploed.cohesion.sequential.classexample;

import java.util.UUID;

class Item {
    private UUID itemNumber;
    private String name;
    private double price;

    public Item(String name, double price) {
        this.itemNumber = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public UUID getItemNumber() {
        return itemNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
