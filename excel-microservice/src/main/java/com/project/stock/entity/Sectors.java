package com.project.stock.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sectors {
	@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int id; 
	private String name;
	private String about;
	public int getSector_id() {  
	        return id;  
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
}
