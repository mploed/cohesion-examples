package com.mploed.cohesion.temporal.packageexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InitializationProcess {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(ConfigLoader::loadConfigs);
        executor.submit(LoggerInitializer::initializeLogger);
        executor.submit(DatabaseInitializer::initializeDatabase);

        executor.shutdown();

    }
}
