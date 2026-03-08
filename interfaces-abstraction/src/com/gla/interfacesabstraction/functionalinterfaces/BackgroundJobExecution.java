package com.gla.interfacesabstraction.functionalinterfaces;

public class BackgroundJobExecution {
    @FunctionalInterface
    interface BackgroundJob {
        void execute(String jobName);
    }

    public static void main(String[] args) {
        BackgroundJob job = jobName -> System.out.println("Executing background job: " + jobName);
        job.execute("NightlyDataSync");
    }
}
