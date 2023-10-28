package com.hibernateRealtions.HibernateRealtions;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptops {
	@Id
	private int lid;
	private String brand;
	private int price;
	@ManyToOne
	private Aliens aliens;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Aliens getAlien() {
		return aliens;
	}
	public void setAlien(Aliens alien) {
		this.aliens = alien;
	}
	 @Override
	    public String toString() {
	        return "Laptops{" +
	                "id=" + lid +
	                ", brand='" + brand + '\'' +
	                ", price=" + price +
	                // Include other properties here
	                '}';
	    }
	
	

}
