package com.hrms.entities.concretes;

import com.hrms.core.abstracts.entity.BaseEntityDao;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employer")
public @Data
class Employer{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "is_active")
    private byte status;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "overview")
    private String overview;

    @Column(name = "web_site")
    private String webSite;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "passwordE")
    private String password;

    @Column(name = "addressE")
    private String address;

    public Employer() {
    }

    public Employer(String companyName, String overview, String webSite, String phoneNumber, String emailAddress, String password, String address) {
        this.companyName = companyName;
        this.overview = overview;
        this.webSite = webSite;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.password = password;
        this.address = address;
    }
}
