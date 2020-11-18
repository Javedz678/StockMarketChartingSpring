package com.project.stock.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StockExchange {
	 	@Id  
	    @GeneratedValue(strategy=GenerationType.IDENTITY)  
	    private int id; 
	 	private String stockExchangeName;
	 	private String about;
	 	private String address;
	 
	 public int getStockExchange_id() {  
	        return id;  
	    }

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	 
}
