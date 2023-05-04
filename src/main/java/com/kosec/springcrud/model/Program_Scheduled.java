package com.kosec.springcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Program_Scheduled")
public class Program_Scheduled {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "S_Prog_Id")
    private String S_Prog_Id;
    @Column(name = "PName")
    private String PName;
    @Column(name = "Location")
    private String Location;
    @Column(name = "Start_Date")
    private String Start_Date;
    @Column(name = "End_Date")
    private String End_Date;
    @Column(name = "S_per_week")
    private int S_per_week;
    
    public String getS_Prog_Id() {
        return S_Prog_Id;
    }
    public void setS_Prog_Id(String s_Prog_Id) {
        S_Prog_Id = s_Prog_Id;
    }
    public String getPName() {
        return PName;
    }
    public void setPName(String pName) {
        PName = pName;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        Location = location;
    }
    public String getStart_Date() {
        return Start_Date;
    }
    public void setStart_Date(String start_Date) {
        Start_Date = start_Date;
    }
    public String getEnd_Date() {
        return End_Date;
    }
    public void setEnd_Date(String end_Date) {
        End_Date = end_Date;
    }
    public int getS_per_week() {
        return S_per_week;
    }
    public void setS_per_week(int s_per_week) {
        S_per_week = s_per_week;
    }
    
    
}
