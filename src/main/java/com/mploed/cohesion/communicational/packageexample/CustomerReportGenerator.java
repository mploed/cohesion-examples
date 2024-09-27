package com.mploed.cohesion.communicational.packageexample;

class CustomerReportGenerator {
    public static void generateReport(Customer customer) {
        System.out.println("Report for customer: " + customer.getName());
    }
}
