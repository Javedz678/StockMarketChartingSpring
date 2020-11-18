package com.project.stock.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CompanyData")
public class CompanyData {
	 	@Id  
	    @GeneratedValue(strategy=GenerationType.IDENTITY)  
	    private int id; 
	 	private String name;
	 	private String exchange;
	    private float price; 
	    private String date;
	    private String time;
	    
		

		public CompanyData(String name, String exchange, float price, String date, String time) {
			super();
			this.name = name;
			this.exchange = exchange;
			this.price = price;
			this.date = date;
			this.time = time;
		}

		public String getExchange() {
			return exchange;
		}

		public void setExchange(String exchange) {
			this.exchange = exchange;
		}

		public CompanyData() {
			
		}

		public int getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
	

		 

	

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		@Override
		  public String toString() {
		    return "CompanyData [name=" + name +"exchange=" + exchange + ", price=" + price + ", date=" + date + ", time=" + time + "]";
		  }
	    
}
