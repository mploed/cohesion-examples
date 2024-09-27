package com.mploed.cohesion.communicational.classexample;

class Customer {
    private int id;

    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
