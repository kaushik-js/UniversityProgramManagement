package com.kosec.springcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Applicant")
public class Applicant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "dob")
    private String dob;
    @Column(name = "h_quli")
    private String h_quli;
    @Column(name = "mObt")
    private int mObt;
    @Column(name = "goals")
    private String goals;
    @Column(name = "progId")
    private String progId;
    @Column(name = "status")
    private String status;
    @Column(name = "dobInt")
    private String dobInt;
    @Column(name = "email")
    private String email;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getH_quli() {
        return h_quli;
    }
    public void setH_quli(String h_quli) {
        this.h_quli = h_quli;
    }
    public int getmObt() {
        return mObt;
    }
    public void setmObt(int mObt) {
        this.mObt = mObt;
    }
    public String getGoals() {
        return goals;
    }
    public void setGoals(String goals) {
        this.goals = goals;
    }
    public String getProgId() {
        return progId;
    }
    public void setProgId(String progId) {
        this.progId = progId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDobInt() {
        return dobInt;
    }
    public void setDobInt(String dobInt) {
        this.dobInt = dobInt;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
  
}
