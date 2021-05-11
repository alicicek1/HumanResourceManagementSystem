package com.hrms.entities.concretes;

import com.hrms.core.abstracts.entity.BaseEntityDao;
import com.hrms.entities.enums.Gender;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "job_seeker")
public @Data
class JobSeeker  {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "is_active")
    private byte status;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identity_no")
    private String identityNo;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "password")
    private String password;

    @Column(name = "usernameU")
    private String username;

    @Column(name = "gender")
    private Gender gender;
}
