package com.controller.ClientesAPI.Repositories;

import com.controller.ClientesAPI.Entities.Company;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Repository
public class CompanyRepositoryImpl implements CompanyRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public Set<Company> getAll() {
        List<Company> companiesList =
                entityManager
                        .createNamedQuery("Company.getAll")
                        .getResultList();
        return new LinkedHashSet<>(companiesList);
    }
}
