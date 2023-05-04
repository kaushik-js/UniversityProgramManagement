package com.kosec.springcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kosec.springcrud.model.Applicant;

@Repository
public interface ApplicantRepository  extends JpaRepository<Applicant,Long>{
    
}
