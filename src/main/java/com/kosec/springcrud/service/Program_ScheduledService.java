package com.kosec.springcrud.service;

import com.kosec.springcrud.model.Program_Scheduled;
import java.util.*;

public interface Program_ScheduledService{
    void saveProgram_Scheduled(Program_Scheduled applicant);
    List<Program_Scheduled> getAllProgram_Scheduleds();
    void deleteProgramById(Long id);
}
