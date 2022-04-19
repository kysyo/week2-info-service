package com.assignmentwebflux.infoservice;

public class InfoData {
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    String job;

    public InfoData(String job){
        this.job = job;
    }
}
