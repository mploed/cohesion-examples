package com.mploed.cohesion.functional.packageexample;

class Applicant {
    private Age age;
    private Income income;
    private Job job;

    public Applicant(Age age, Income income, Job job) {
        this.age = age;
        this.income = income;
        this.job = job;
    }

    public int calculateCreditScore() {
        int score = 0;
        score += age.score();
        score += job.score();
        score += income.score();
        return score;
    }
}
