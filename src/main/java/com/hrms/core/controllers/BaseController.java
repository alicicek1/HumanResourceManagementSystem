package com.hrms.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface BaseController<T> {
    void add(T entity);

    void update(T entity);

    void delete(T entity);

    void deleteById(long id);

    T getOne(long id);

    List<T> getAll();
}
