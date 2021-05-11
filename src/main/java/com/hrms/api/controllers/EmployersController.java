package com.hrms.api.controllers;

import com.hrms.business.abstracts.EmployerService;
import com.hrms.core.controllers.BaseController;
import com.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Employers")
public class EmployersController implements BaseController<Employer> {

    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @Override
    @GetMapping("/add")
    public void add(Employer entity) {
        employerService.add(entity);
    }

    @Override
    @GetMapping("/update")
    public void update(Employer entity) {
        employerService.update(entity);
    }

    @Override
    @GetMapping("/delete")
    public void delete(Employer entity) {
        employerService.delete(entity);
    }

    @Override
    @GetMapping("/deletebyid")
    @ResponseBody
    public void deleteById(@RequestParam(required = false) long id) {
        employerService.deleteById(id);
    }

    @Override
    @GetMapping("/getone")
    public Employer getOne(long id) {
        return employerService.getOne(id);
    }

    @Override
    @GetMapping("/getall")
    public List<Employer> getAll() {
        return employerService.getAll();
    }
}
