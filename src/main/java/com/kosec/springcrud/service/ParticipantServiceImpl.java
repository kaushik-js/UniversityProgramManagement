package com.kosec.springcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosec.springcrud.model.Participant;
import com.kosec.springcrud.repository.ParticipantRepository;

@Service
public class ParticipantServiceImpl implements ParticipantService {


    @Autowired
    private ParticipantRepository participantRepository;

    @Override
    public List<Participant> getAllParticipant() {
        return participantRepository.findAll();
        
    }

    @Override
    public void addParticipant(Participant participant) {
        this.participantRepository.save(participant);
    }
    
    
}
