package com.mploed.cohesion.sequential.packageexample;

import java.util.Date;
import java.util.UUID;

class Payment {
    private UUID paymentNumber;
    private PaymentStatus status;

    private double amount;

    private Date paymentDate;

    public Payment() {
        this.paymentNumber = UUID.randomUUID();
        this.status = PaymentStatus.OPEN;
        this.paymentDate = new Date();
    }

    public void addAmount(double amount) {
        this.amount += amount;
    }

    public PaymentStatus performPayment() {
        this.status = PaymentStatus.PAID;
        this.paymentDate = new Date();
        return this.status;
    }

    public UUID getPaymentNumber() {
        return paymentNumber;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }
}
