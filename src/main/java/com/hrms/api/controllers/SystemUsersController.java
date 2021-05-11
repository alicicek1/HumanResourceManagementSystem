package com.hrms.api.controllers;

import com.hrms.business.abstracts.SystemUserService;
import com.hrms.core.controllers.BaseController;
import com.hrms.entities.concretes.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/SystemUsers")
public class SystemUsersController implements BaseController<SystemUser> {

    private SystemUserService systemUserService;

    @Autowired
    public SystemUsersController(SystemUserService systemUserService) {
        this.systemUserService = systemUserService;
    }

    @Override
    @GetMapping("/add")
    public void add(SystemUser entity) {
        systemUserService.add(entity);
    }

    @Override
    @GetMapping("/update")
    public void update(SystemUser entity) {
        systemUserService.update(entity);
    }

    @Override
    @GetMapping("/delete")
    public void delete(SystemUser entity) {
        systemUserService.delete(entity);
    }

    @Override
    @GetMapping("/deletebyid")
    @ResponseBody
    public void deleteById(@RequestParam(required = false) long id) {
        systemUserService.deleteById(id);
    }

    @Override
    @GetMapping("/getone")
    public SystemUser getOne(long id) {
        return systemUserService.getOne(id);
    }

    @Override
    @GetMapping("/getall")
    public List<SystemUser> getAll() {
        return systemUserService.getAll();
    }
}
