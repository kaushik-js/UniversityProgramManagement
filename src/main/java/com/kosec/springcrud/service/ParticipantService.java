package com.kosec.springcrud.service;

import java.util.*;

import com.kosec.springcrud.model.Participant;

public interface ParticipantService {
    List<Participant> getAllParticipant();
    void addParticipant(Participant participant);

}
