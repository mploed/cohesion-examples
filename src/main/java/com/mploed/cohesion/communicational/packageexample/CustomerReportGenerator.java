package com.mploed.cohesion.communicational.packageexample;

public class CustomerReportGenerator {
    public static void generateReport(Customer customer) {
        System.out.println("Report for customer: " + customer.getName());
    }
}
