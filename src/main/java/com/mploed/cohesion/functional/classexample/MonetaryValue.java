package com.mploed.cohesion.functional.classexample;

import java.math.BigDecimal;

class MonetaryValue {
    private BigDecimal amount;

    public MonetaryValue(BigDecimal amount) {
        this.amount = amount;
    }

    public MonetaryValue(double amount) {
        this.amount = BigDecimal.valueOf(amount);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public boolean isLessThan(MonetaryValue amount) {
        return this.amount.compareTo(amount.getAmount()) < 0;
    }

    public MonetaryValue subtract(MonetaryValue amount) {
        return new MonetaryValue(this.amount.subtract(amount.getAmount()));
    }

    public MonetaryValue add(MonetaryValue amount) {
        return new MonetaryValue(this.amount.add(amount.getAmount()));
    }
}
