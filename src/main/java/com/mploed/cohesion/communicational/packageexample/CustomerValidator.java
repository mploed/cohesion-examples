package com.mploed.cohesion.communicational.packageexample;

public class CustomerValidator {
    public static boolean validateCustomer(Customer customer) {
        return customer.getName() != null;
    }
}
