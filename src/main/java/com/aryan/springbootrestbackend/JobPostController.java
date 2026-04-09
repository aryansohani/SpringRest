package com.aryan.springbootrestbackend;

import com.aryan.springbootrestbackend.model.JobPost;
import com.aryan.springbootrestbackend.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class JobPostController {

    @Autowired
    private JobService serve;

    @GetMapping(path="JobPosts", produces = "application/json")
    public List<JobPost> gettingallposts()
    {
        return serve.getAllJobs();
    }

    @GetMapping("JobPosts/{postId}")
    public JobPost getjob(@PathVariable("postId")int postId)
    {
        return serve.getjob(postId);
    }

    @PostMapping("JobPosts")
    public void addjobs(@RequestBody JobPost jobpost)
    {
        serve.addJob(jobpost);
    }

    @PutMapping("JobPosts")
    public void updatejob(@RequestBody JobPost jobpost)
    {
        serve.updatejob(jobpost);
    }

    @DeleteMapping("JobPost/{PostId}")
    public void deletejob(@PathVariable int PostId)
    {
        serve.deletejob(PostId);
    }



}
