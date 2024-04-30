package com.controller.ClientesAPI.Controllers;

import com.controller.ClientesAPI.Entities.Company;
import com.controller.ClientesAPI.Services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Set;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping("/")
    public ResponseEntity<Set<Company>> getCompanies() {
        return companyService.getAllCompanies();
    }
}
