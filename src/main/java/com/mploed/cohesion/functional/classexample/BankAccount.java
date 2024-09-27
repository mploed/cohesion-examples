package com.mploed.cohesion.functional.classexample;

public class BankAccount {
    private MonetaryValue balance;

    public MonetaryValue deposit(MonetaryValue amount) {
        return this.balance.add(amount);

    }
    public MonetaryValue withdraw(MonetaryValue amount) {
        if(balance.isLessThan(amount)) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        return this.balance.subtract(amount);
    }
    public MonetaryValue getCurrentBalance() {
        return this.balance;
    }

}
