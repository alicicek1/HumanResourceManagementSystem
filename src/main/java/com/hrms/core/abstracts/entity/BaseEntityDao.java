package com.hrms.core.abstracts.entity;

import lombok.Data;

import javax.persistence.*;

public @Data
class BaseEntityDao {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "is_active")
    private byte status;


}
