package com.hrms.business.concretes;

import com.hrms.business.abstracts.JobService;
import com.hrms.data.abstracts.JobDao;
import com.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    //region Vars
    private JobDao jobDao;

    //endregion

    //region Cons
    @Autowired
    public JobManager(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    //endregion


    @Override
    public void add(Job entity) {
        jobDao.save(entity);
    }

    @Override
    public void update(Job entity) {
        jobDao.save(entity);
    }

    @Override
    public void delete(Job entity) {
        jobDao.delete(entity);
    }

    @Override
    public void deleteById(long id) {
        jobDao.delete(jobDao.getOne(id));
    }

    @Override
    public Job getOne(long id) {
        return jobDao.getOne(id);
    }

    @Override
    public List<Job> getAll() {
        return jobDao.findAll();
    }
}
