package com.kosec.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kosec.springcrud.model.Program_Offered;
import com.kosec.springcrud.model.Program_Scheduled;

@Repository
public interface Program_ScheduledRepository extends JpaRepository<Program_Scheduled, Long> {    
   
}
