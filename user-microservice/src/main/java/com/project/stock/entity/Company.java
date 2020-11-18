package com.project.stock.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Company {
	
	    @Id  
	    @GeneratedValue(strategy=GenerationType.IDENTITY)  
	    private int id;  
	    private String name;
	    private String turnover;
	    private String CEO; 
	    private String director;
	    private String about;
	    private String exchange;
	    private String sector;
	    
	    public int getComapany_id() {  
	        return id;  
	    }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTurnover() {
			return turnover;
		}
		public void setTurnover(String turnover) {
			this.turnover = turnover;
		}
		public String getCEO() {
			return CEO;
		}
		public void setCEO(String CEO) {
			this.CEO = CEO;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public String getAbout() {
			return about;
		}
		public void setAbout(String about) {
			this.about = about;
		}
		public String getExchange() {
			return exchange;
		}
		public void setExchange(String exchange) {
			this.exchange = exchange;
		}
		public String getSector() {
			return sector;
		}
		public void setSector(String sector) {
			this.sector = sector;
		} 
	    
}
