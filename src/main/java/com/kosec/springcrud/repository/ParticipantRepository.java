package com.kosec.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kosec.springcrud.model.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant,Long>{    
}
