package com.kosec.springcrud.service;

import java.util.List;

import com.kosec.springcrud.model.Program_Offered;

public interface Program_OfferedService {
    List<Program_Offered> getAllProgram_Offered();
    void saveProgram_Offered(Program_Offered program_offered);    
}
