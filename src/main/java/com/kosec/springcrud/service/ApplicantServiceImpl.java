package com.kosec.springcrud.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kosec.springcrud.model.Applicant;
import com.kosec.springcrud.repository.ApplicantRepository;

@Service
public class ApplicantServiceImpl implements ApplicantService{
    
    @Autowired
    private ApplicantRepository applicantRepository;

    @Override
    public void saveApplicant(Applicant applicant) {
        this.applicantRepository.save(applicant);        
    }

    @Override
    public List<Applicant> getAllApplicants() {
        return applicantRepository.findAll();
    }

    @Override
    public Optional<Applicant> getApplicant(Long id) {
       return applicantRepository.findById(id);
    }

    @Override
    public void updateStatus(Applicant applicant) {
        applicantRepository.save(applicant);
    }
}
