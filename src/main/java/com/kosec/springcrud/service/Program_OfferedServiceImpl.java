package com.kosec.springcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosec.springcrud.model.Program_Offered;
import com.kosec.springcrud.repository.ProgramOfferedRepository;

@Service
public class Program_OfferedServiceImpl implements Program_OfferedService{


    @Autowired
    private ProgramOfferedRepository offeredRepository;

    @Override
    public List<Program_Offered> getAllProgram_Offered() {
        return offeredRepository.findAll();        
    }

    @Override
    public void saveProgram_Offered(Program_Offered program_offered) {
        this.offeredRepository.save(program_offered);
    }
    
    
}
