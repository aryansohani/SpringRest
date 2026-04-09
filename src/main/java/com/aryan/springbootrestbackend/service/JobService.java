package com.aryan.springbootrestbackend.service;

import com.aryan.springbootrestbackend.model.JobPost;
import com.aryan.springbootrestbackend.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository repo;

    // ✅ Add Job (delegates to repository)
    public void addJob(JobPost job) {
        repo.save(job);
    }

    // ✅ Get All Jobs (delegates to repository)
    public List<JobPost> getAllJobs() {
        return repo.findAll();
    }

    public JobPost getjob(int postId)
    {
        return repo.getjob(postId);
    }

    public void updatejob(JobPost jobpost) {

        repo.updatejob(jobpost);
    }

    public void deletejob(int postId)
    {
        repo.deletejob(postId);
    }
}