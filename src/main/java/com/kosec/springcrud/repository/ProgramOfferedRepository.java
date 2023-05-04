package com.kosec.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kosec.springcrud.model.Program_Offered;

@Repository
public interface ProgramOfferedRepository extends JpaRepository<Program_Offered,Long>{

   
}
