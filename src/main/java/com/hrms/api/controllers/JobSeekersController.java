package com.hrms.api.controllers;

import com.hrms.business.abstracts.JobSeekerService;
import com.hrms.core.controllers.BaseController;
import com.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/JobSeekers")
public class JobSeekersController implements BaseController<JobSeeker> {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @Override
    @GetMapping("/add")
    public void add(JobSeeker entity) {
        jobSeekerService.add(entity);
    }

    @Override
    @GetMapping("/update")
    public void update(JobSeeker entity) {
        jobSeekerService.update(entity);
    }

    @Override
    @GetMapping("/delete")
    public void delete(JobSeeker entity) {
        jobSeekerService.delete(entity);
    }

    @Override
    @GetMapping("/deletebyid")
    @ResponseBody
    public void deleteById(@RequestParam(required = false) long id) {
        jobSeekerService.deleteById(id);
    }

    @Override
    @GetMapping("/getone")
    public JobSeeker getOne(long id) {
        return jobSeekerService.getOne(id);
    }

    @Override
    @GetMapping("/getall")
    public List<JobSeeker> getAll() {
        return jobSeekerService.getAll();
    }
}
