package com.project.stock.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class IPO {
	@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    private int id;
	private String companyName;
	private String exchange;
	private String pricePershare;
	private String totalNoshare;
	private String address;
	private LocalDate date;
	
	public int getIPO_id() {  
        return id;  
    }

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getPricePershare() {
		return pricePershare;
	}

	public void setPricePershare(String pricePershare) {
		this.pricePershare = pricePershare;
	}

	public String getTotalNoshare() {
		return totalNoshare;
	}

	public void setTotalNoshare(String totalNoshare) {
		this.totalNoshare = totalNoshare;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
