package com.kosec.springcrud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosec.springcrud.model.Program_Scheduled;
import com.kosec.springcrud.repository.Program_ScheduledRepository;
@Service
public class Program_ScheduledServiceImpl implements Program_ScheduledService{
    @Autowired
    private Program_ScheduledRepository program_ScheduledRepository;
    
    @Override
    public void saveProgram_Scheduled(Program_Scheduled program_Scheduled) {
        this.program_ScheduledRepository.save(program_Scheduled);
    }

    @Override
    public List<Program_Scheduled> getAllProgram_Scheduleds() {
        return program_ScheduledRepository.findAll();
    }

    @Override
    public void deleteProgramById(Long id) {
        this.program_ScheduledRepository.deleteById(id);      
    }


    
    
}
