package com.hrms.entities.concretes;

import com.hrms.core.abstracts.entity.BaseEntityDao;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "job")
public @Data class Job {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "is_active")
    private byte status;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "job_location")
    private String jobLocation;

    @Column(name = "employer_id")
    private long employerId;
}
