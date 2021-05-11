package com.hrms.business.concretes;

import com.hrms.business.abstracts.EmployerService;
import com.hrms.data.abstracts.EmployerDao;
import com.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    // region Vars
    private EmployerDao employerDao;
    //endregion

    //region Cons
    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }
    //endregion

    @Override
    public void add(Employer entity) {
        employerDao.save(entity);
    }

    @Override
    public void update(Employer entity) {
        employerDao.save(entity);
    }

    @Override
    public void delete(Employer entity) {
        employerDao.delete(entity);
    }

    @Override
    public void deleteById(long id) {
        employerDao.delete(employerDao.getOne(id));
    }

    @Override
    public Employer getOne(long id) {
        return employerDao.getOne(id);
    }

    @Override
    public List<Employer> getAll() {
        return employerDao.findAll();
    }
}
