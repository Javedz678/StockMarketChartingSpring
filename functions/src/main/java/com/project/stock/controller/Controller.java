package com.project.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.stock.entity.Company;
import com.project.stock.entity.IPO;
import com.project.stock.entity.Sectors;
import com.project.stock.entity.StockExchange;
import com.project.stock.service.RestService;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
 
public class Controller {
	
	@Autowired
	private RestService restService;;
	

	
	
	@PostMapping("/add-company")  
	public Boolean addCompany(@RequestBody Company company) {
		return restService.addCompany(company);
	}
	
	@GetMapping("/deleteCompany/{name}")  
	public Boolean deleteCompany(@PathVariable("name")String name) {
		
		return restService.deleteCompany(name);
	}
	
	
	@PostMapping("/add-ipo") 
	public Boolean addIPO(@RequestBody IPO ipo) {
		
		
		return restService.addIPO(ipo);
	}
	
	@PostMapping("/add-exchange") 
	public Boolean addStockExchange(@RequestBody StockExchange exchange) {
		
		
		return restService.addStockExchange(exchange);
	}
	
	@GetMapping("/company-list") 
	public List<Company> getCompanyList() {
		return restService.getCompanyList();
	}
	
	@GetMapping("/exchange-list") 
	public List<StockExchange> getExchangeList() {
		return restService.getExchangeList();
	}
	
	@GetMapping("/ipo-list") 
	public List<IPO> getIpolist() {
		return restService.getIpolist();
	}
	
	@GetMapping("/getSector/{id}") 
	public List<Sectors> getSectors(@PathVariable("id") int id) {
		return restService.getSectors(id);
	}
	
	

	@GetMapping("/getCompany/{name}") 
	public List<Company> getCompany(@PathVariable("name") String name) {
		return restService.getCompany(name);
	}
	
	@GetMapping("/getSector") 
	public List<Sectors> getSectors() {
		return restService.getSectors();
	}

	
	@GetMapping("/updateCompany/{name}/{turnover}/{CEO}/{director}/{about}/{exchange}/{sector}") 
	public List<Company> updateCompany(@PathVariable("name") String name,@PathVariable("turnover") String turnover,@PathVariable("CEO") String CEO,
			@PathVariable("director") String director,@PathVariable("about") String about,@PathVariable("exchange") String exchange,@PathVariable("sector") String sector) {
		
		return restService.updateCompany(name, turnover, CEO, director, about, exchange, sector);
	}
	@PostMapping("updateCompany/{id}/{ceo}")  
    public Boolean updateCompany(@RequestBody Company company,@PathVariable("id") String id,@PathVariable("ceo") String ceo) {  
		
        return restService.updateCompany(company, id, ceo);
    }  
	
}
