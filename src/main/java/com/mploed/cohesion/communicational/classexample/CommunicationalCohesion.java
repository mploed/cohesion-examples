package com.mploed.cohesion.communicational.classexample;

public class CommunicationalCohesion {

    public static void main(String[] args) {
        Customer customer = loadCustomer(1);
        if(validateCustomer(customer)) {
            generateReport(customer);
        }

    }

    public static Customer loadCustomer(int id) {
        return new Customer(id, "Michael Plöd");
    }

    public static boolean validateCustomer(Customer customer) {
        return customer.getName() != null;
    }

    public static void generateReport(Customer customer) {
        System.out.println("Report for customer: " + customer.getName());
    }
}
