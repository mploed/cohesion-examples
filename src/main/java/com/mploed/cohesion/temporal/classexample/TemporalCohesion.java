package com.mploed.cohesion.temporal.classexample;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TemporalCohesion {
    public static void loadConfigs() {
        System.out.println("Loading system configurations...");
    }
    public static void initializeDatabase() {
        System.out.println("Initializing database connection...");
    }

    public static void initializeLogger() {
        System.out.println("Initializing logger...");
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(TemporalCohesion::loadConfigs);
        executor.submit(TemporalCohesion::initializeLogger);
        executor.submit(TemporalCohesion::initializeDatabase);

        executor.shutdown();

    }
}
