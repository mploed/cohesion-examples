package com.mploed.cohesion.sequential.packageexample;

class InvoiceGenerator {
    public static Invoice generateInvoice(Payment payment) {
        Invoice invoice = new Invoice(payment.getAmount());
        return invoice;
    }
}
