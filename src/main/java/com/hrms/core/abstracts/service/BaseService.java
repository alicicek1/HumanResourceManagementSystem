package com.hrms.core.abstracts.service;

import java.util.List;

public interface BaseService<T> {

    void add(T entity);

    void update(T entity);

    void delete(T entity);

    void deleteById(long id);

    T getOne(long id);

    List<T> getAll();
}
