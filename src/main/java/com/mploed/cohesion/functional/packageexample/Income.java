package com.mploed.cohesion.functional.packageexample;

public class Income {
    private int income;

    public Income(int income) {
        this.income = income;
    }

    public int score() {
        if (income < 1000) {
            return 0;
        } else if (income < 2000) {
            return 25;
        } else if (income < 3000) {
            return 40;
        } else if (income < 4000) {
            return 45;
        } else if (income >= 4000) {
            return 50;
        } else {
            return 0;
        }
    }
}
