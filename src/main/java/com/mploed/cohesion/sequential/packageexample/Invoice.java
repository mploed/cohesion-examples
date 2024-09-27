package com.mploed.cohesion.sequential.packageexample;

import java.util.Date;
import java.util.UUID;

public class Invoice {
    private UUID invoiceNumber;

    private Date invoiceDate;

    private double amount;

    public Invoice(double amount) {
        this.invoiceNumber = UUID.randomUUID();
        this.invoiceDate = new Date();
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber=" + invoiceNumber +
                ", invoiceDate=" + invoiceDate +
                ", amount=" + amount +
                '}';
    }
}