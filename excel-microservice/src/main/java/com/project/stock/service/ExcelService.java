package com.project.stock.service;

import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.stock.entity.CompanyData;
import com.project.stock.repository.CompanyDataRepository;
import com.project.stock.utility.ExcelParser;
@Service
public class ExcelService {
	  @Autowired
	  CompanyDataRepository repository;
	  public void save(MultipartFile file) {
		    try {
		      List<CompanyData> companyDataList = ExcelParser.excelToTable(file.getInputStream());
		      repository.saveAll(companyDataList);
		    } catch (IOException e) {
		      throw new RuntimeException("fail to store excel data: " + e.getMessage());
		    }
		  }

		  public List<CompanyData> getAllTutorials() {
		    return repository.findAll();
		  }
		  public List<String> getNames () {
			    return repository.findDistinctNames();
			  }
		  public List<CompanyData> findByName(String name) {
			    return repository.findByName(name);
			  }
}
