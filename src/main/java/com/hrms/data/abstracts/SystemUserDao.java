package com.hrms.data.abstracts;

import com.hrms.entities.concretes.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUserDao extends JpaRepository<SystemUser, Long> {
}
