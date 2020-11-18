package com.project.stock.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.project.stock.entity.Company;

public interface CompanyRepository extends CrudRepository<Company, Integer> {
	Optional<Company> findByName(String name);
	Optional<Company> deleteByName(String name);
}
