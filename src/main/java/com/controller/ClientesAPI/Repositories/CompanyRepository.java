package com.controller.ClientesAPI.Repositories;

import com.controller.ClientesAPI.Entities.Company;

import java.util.List;
import java.util.Set;

public interface CompanyRepository {
    Set<Company> getAll();
}
