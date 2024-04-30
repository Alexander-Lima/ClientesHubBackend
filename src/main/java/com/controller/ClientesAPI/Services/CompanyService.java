package com.controller.ClientesAPI.Services;

import com.controller.ClientesAPI.Entities.Company;
import com.controller.ClientesAPI.Repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public ResponseEntity<Set<Company>> getAllCompanies() {
        return ResponseEntity.ok().body(companyRepository.getAll());
    }
}
