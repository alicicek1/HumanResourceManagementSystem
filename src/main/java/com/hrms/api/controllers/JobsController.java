package com.hrms.api.controllers;

import com.hrms.business.abstracts.JobService;
import com.hrms.core.controllers.BaseController;
import com.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Jobs")
public class JobsController implements BaseController<Job> {

    private JobService jobService;

    @Autowired
    public JobsController(JobService jobService) {
        this.jobService = jobService;
    }

    @Override
    @GetMapping("/add")
    public void add(Job entity) {
        jobService.add(entity);
    }

    @Override
    @GetMapping("/update")
    public void update(Job entity) {
        jobService.update(entity);
    }

    @Override
    @GetMapping("/delete")
    public void delete(Job entity) {
        jobService.delete(entity);
    }

    @Override
    @GetMapping("/deletebyid")
    @ResponseBody
    public void deleteById(@RequestParam(required = false) long id) {
        jobService.deleteById(id);
    }

    @Override
    @GetMapping("/getone")
    public Job getOne(long id) {
        return jobService.getOne(id);
    }

    @Override
    @GetMapping("/getall")
    public List<Job> getAll() {
        return jobService.getAll();
    }
}
