package com.kosec.springcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participant")
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "roll_no")
    private String roll_no;
    @Column(name = "email")
    private String email;
    @Column(name = "app_id")
    private Long app_id;
    @Column(name = "sc_prog_id")
    private String sc_prog_id;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getRoll_no() {
        return roll_no;
    }
    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getApp_id() {
        return app_id;
    }
    public void setApp_id(Long app_id) {
        this.app_id = app_id;
    }
    public String getSc_prog_id() {
        return sc_prog_id;
    }
    public void setSc_prog_id(String sc_prog_id) {
        this.sc_prog_id = sc_prog_id;
    }

    



    
}
