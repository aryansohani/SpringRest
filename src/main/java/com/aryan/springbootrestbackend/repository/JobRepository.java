package com.aryan.springbootrestbackend.repository;

import com.aryan.springbootrestbackend.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepository {
    private List<JobPost> jobs = new ArrayList<>();

    // ✅ Constructor → preload 5 jobs
    public JobRepository() {
        jobs.add(new JobPost(1, "Frontend Developer", 2, Arrays.asList("HTML", "CSS", "JavaScript")));
        jobs.add(new JobPost(2, "Backend Developer", 3, Arrays.asList("Java", "Spring Boot", "MySQL")));
        jobs.add(new JobPost(3, "Full Stack Developer", 4, Arrays.asList("React", "Node.js", "MongoDB")));
        jobs.add(new JobPost(4, "DevOps Engineer", 5, Arrays.asList("Docker", "Kubernetes", "AWS")));
        jobs.add(new JobPost(5, "Data Analyst", 2, Arrays.asList("Python", "Pandas", "SQL")));
    }

    // ✅ Get All Jobs
    public List<JobPost> findAll() {
        return jobs;
    }

    // ✅ Add Job
    public void save(JobPost job) {
        jobs.add(job);
    }

    public JobPost getjob(int postId)
    {
        for(JobPost job:jobs)
        {
            if(job.getJobId()==postId)
            {
                return job;
            }
        }
        return null;
    }

    public void updatejob(JobPost jobpost)
    {
        for(JobPost job:jobs)
        {
            if(job.getJobId()==jobpost.getJobId())
            {
                job.setJobName(jobpost.getJobName());
                job.setExperience(jobpost.getExperience());
                job.setTechStack(jobpost.getTechStack());
                break;
            }
        }
    }


    public void deletejob(int postId)
    {
        jobs.removeIf(job -> job.getJobId() == postId);
    }
}

