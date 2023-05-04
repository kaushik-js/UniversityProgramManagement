package com.kosec.springcrud.service;

import java.util.List;
import java.util.Optional;

import com.kosec.springcrud.model.Applicant;
import com.kosec.springcrud.repository.ApplicantRepository;

public interface ApplicantService {
    void saveApplicant(Applicant applicant);
    List<Applicant> getAllApplicants();
    Optional<Applicant> getApplicant(Long id);
    void updateStatus(Applicant applicant);
}
  