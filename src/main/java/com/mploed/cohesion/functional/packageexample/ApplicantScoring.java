package com.mploed.cohesion.functional.packageexample;

public class ApplicantScoring {
    public static void main(String[] args) {
        Job job = new Job(JobType.JUNIOR_DEVELOPER);
        Income income = new Income(3000);
        Age age = new Age(32);

        Applicant applicant = new Applicant(age, income, job);

        int creditScore = applicant.calculateCreditScore();

        System.out.println("Credit score: " + creditScore);
    }
}


