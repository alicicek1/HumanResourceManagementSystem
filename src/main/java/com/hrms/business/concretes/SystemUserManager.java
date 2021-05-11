package com.hrms.business.concretes;

import com.hrms.business.abstracts.SystemUserService;
import com.hrms.data.abstracts.SystemUserDao;
import com.hrms.entities.concretes.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemUserManager implements SystemUserService {


    //region Vars
    private SystemUserDao systemUserDao;
    //endregion

    //region Cons
    @Autowired
    public SystemUserManager(SystemUserDao systemUserDao) {
        this.systemUserDao = systemUserDao;
    }

    //endregion

    @Override
    public void add(SystemUser entity) {
        systemUserDao.save(entity);
    }

    @Override
    public void update(SystemUser entity) {
        systemUserDao.save(entity);
    }

    @Override
    public void delete(SystemUser entity) {
        systemUserDao.delete(entity);
    }

    @Override
    public void deleteById(long id) {
        systemUserDao.delete(systemUserDao.getOne(id));
    }

    @Override
    public SystemUser getOne(long id) {
        return systemUserDao.getOne(id);
    }

    @Override
    public List<SystemUser> getAll() {
        return systemUserDao.findAll();
    }
}
