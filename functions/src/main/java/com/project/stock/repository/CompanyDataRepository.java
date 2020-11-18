package com.project.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.stock.entity.CompanyData;

public interface CompanyDataRepository extends JpaRepository<CompanyData, Integer> {
	List<CompanyData> findByName(String name);
	
	 @Query("SELECT DISTINCT a.name FROM CompanyData a")
	    List<String> findDistinctNames();
	 
}
