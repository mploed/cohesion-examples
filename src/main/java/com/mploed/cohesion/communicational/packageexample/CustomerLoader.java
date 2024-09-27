package com.mploed.cohesion.communicational.packageexample;

class CustomerLoader {
    public static Customer loadCustomer(int id) {
        return new Customer(id, "Michael Plöd");
    }
}
