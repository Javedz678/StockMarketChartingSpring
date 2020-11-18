package com.project.stock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.stock.entity.Company;
import com.project.stock.entity.IPO;
import com.project.stock.entity.Sectors;
import com.project.stock.entity.StockExchange;
import com.project.stock.repository.CompanyRepository;
import com.project.stock.repository.IPORepository;
import com.project.stock.repository.SectorsRepository;
import com.project.stock.repository.StockExchangeRepository;

@Service
public class RestService {

	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private SectorsRepository sectorsRepository;
	@Autowired
	private StockExchangeRepository stockExchangeRepository;
	@Autowired
	private IPORepository ipoRepository;
	
	
	
	public Boolean addCompany( Company company) {
		
		companyRepository.save(company);
		return true;
	}
	public Boolean deleteCompany(String name) {
		int id= companyRepository.findByName(name).get().getComapany_id();
		companyRepository.deleteById(id);
		return true;
	}

	
	

	public Boolean addIPO(IPO ipo) {
		
		ipoRepository.save(ipo);
		return true;
	}

	public Boolean addStockExchange(StockExchange exchange) {
		
		stockExchangeRepository.save(exchange);
		return true;
	}

	public List<Company> getCompanyList() {
		List<Company> companylist = new ArrayList<Company>();
		companyRepository.findAll().forEach(companylist::add);
		return companylist;
	}

	public List<StockExchange> getExchangeList() {
		List<StockExchange> exchangelist = new ArrayList<StockExchange>();
		stockExchangeRepository.findAll().forEach(exchangelist::add);
		return exchangelist;
	}

	public List<IPO> getIpolist() {
		List<IPO> IPOlist = new ArrayList<IPO>();
		ipoRepository.findAll().forEach(IPOlist::add);
		return IPOlist;
	}

	public List<Sectors> getSectors(int id) {
		List<Sectors> sector = new ArrayList<Sectors>();
		Sectors gotsector= sectorsRepository.findById(id).get();
		sector.add(gotsector);
		return sector;
	}


	public List<Company> getCompany(String name) {
		List<Company> company = new ArrayList<Company>();
		Company gotCompany= companyRepository.findByName(name).get();
		company.add(gotCompany);
		return company;
	}

	public List<Sectors> getSectors() {
		List<Sectors> sectors = new ArrayList<Sectors>();
		sectorsRepository.findAll().forEach(sectors::add);
		
		return sectors;
	}

	

	public List<Company> updateCompany(String name, String turnover, String CEO,
			String director, String about, String exchange, String sector) {
		List<Company> company = new ArrayList<Company>();
		Company gotCompany= new Company();
		gotCompany.setAbout(about);
		gotCompany.setName(name);
		gotCompany.setCEO(CEO);
		gotCompany.setDirector(director);
		gotCompany.setExchange(exchange);
		gotCompany.setSector(sector);
		gotCompany.setTurnover(turnover);
		companyRepository.save(gotCompany);
		return company;
	}
	
    public Boolean updateCompany( Company company,String id, String ceo) {  
		Company gotCompany= companyRepository.findByName(id).get();
		gotCompany.setAbout(company.getAbout());
		gotCompany.setName(company.getName());
		gotCompany.setCEO(ceo);
		gotCompany.setDirector(company.getDirector());
		gotCompany.setExchange(company.getExchange());
		gotCompany.setSector(company.getSector());
		gotCompany.setTurnover(company.getTurnover());
        companyRepository.save(gotCompany);
        return true;
    }  
	
}
