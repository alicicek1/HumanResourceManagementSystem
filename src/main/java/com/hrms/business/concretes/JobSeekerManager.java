package com.hrms.business.concretes;

import com.hrms.business.abstracts.JobSeekerService;
import com.hrms.data.abstracts.JobSeekerDao;
import com.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    //region Vars
    private JobSeekerDao jobSeekerDao;
    //endregion

    //region Cons
    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }

    //endregion


    @Override
    public void add(JobSeeker entity) {
        jobSeekerDao.save(entity);
    }

    @Override
    public void update(JobSeeker entity) {
        jobSeekerDao.save(entity);
    }

    @Override
    public void delete(JobSeeker entity) {
        jobSeekerDao.delete(entity);
    }

    @Override
    public void deleteById(long id) {
        jobSeekerDao.delete(jobSeekerDao.getOne(id));
    }

    @Override
    public JobSeeker getOne(long id) {
        return jobSeekerDao.getOne(id);
    }

    @Override
    public List<JobSeeker> getAll() {
        return jobSeekerDao.findAll();
    }
}
