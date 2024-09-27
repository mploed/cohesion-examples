package com.mploed.cohesion.functional.packageexample;

class Age {
    private int age;

    public Age(int age) {
        this.age = age;
    }

    public int score() {
        if (age < 18) {
            return 0;
        } else if (age < 25) {
            return 25;
        } else if (age < 45) {
            return 35;
        } else if (age < 55) {
            return 30;
        } else if (age < 65) {
            return 0;
        } else {
            return 0;
        }
    }
}

