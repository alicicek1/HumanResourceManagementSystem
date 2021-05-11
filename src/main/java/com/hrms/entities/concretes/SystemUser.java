package com.hrms.entities.concretes;

import com.hrms.core.abstracts.entity.BaseEntityDao;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_system")
public @Data
class SystemUser{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "is_active")
    private byte status;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "passwordU")
    private String password;
}
