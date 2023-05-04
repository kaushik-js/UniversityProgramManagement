package com.kosec.springcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "program_offered")
public class Program_Offered {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "sc_prog_id")
    private String sc_prog_id;
    @Column(name = "prog_name")
    private String prog_name;
    @Column(name = "location")
    private String location;
    @Column(name = "start_date")
    private String start_date;
    @Column(name = "end_date")
    private String end_date;
    @Column(name = "ss_per_week")
    private String ss_per_week;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getSc_prog_id() {
        return sc_prog_id;
    }
    public void setSc_prog_id(String sc_prog_id) {
        this.sc_prog_id = sc_prog_id;
    }
    public String getProg_name() {
        return prog_name;
    }
    public void setProg_name(String prog_name) {
        this.prog_name = prog_name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getStart_date() {
        return start_date;
    }
    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }
    public String getEnd_date() {
        return end_date;
    }
    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
    public String getSs_per_week() {
        return ss_per_week;
    }
    public void setSs_per_week(String ss_per_week) {
        this.ss_per_week = ss_per_week;
    }


    

}
