package com.kosec.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kosec.springcrud.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
    
}
