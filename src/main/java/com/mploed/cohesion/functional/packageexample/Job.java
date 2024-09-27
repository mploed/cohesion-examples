package com.mploed.cohesion.functional.packageexample;

class Job {
    private JobType jobType;

    public Job(JobType jobType) {
        this.jobType = jobType;
    }

    public int score() {
        switch (jobType) {
            case STUDENT:
                return 0;
            case JUNIOR_DEVELOPER:
                return 25;
            case SENIOR_DEVELOPER:
                return 40;
            case MANAGER:
                return 35;
            default:
                return 0;
        }
    }
}
