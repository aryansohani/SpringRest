package com.aryan.springbootrestbackend.model;

import java.util.List;

public class JobPost {

    private int jobId;
    private String jobName;
    private int experience;
    private List<String> techStack;


    public JobPost() {
    }


    public JobPost(int jobId, String jobName, int experience, List<String> techStack) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.experience = experience;
        this.techStack = techStack;
    }



    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public void setTechStack(List<String> techStack) {
        this.techStack = techStack;
    }
}
