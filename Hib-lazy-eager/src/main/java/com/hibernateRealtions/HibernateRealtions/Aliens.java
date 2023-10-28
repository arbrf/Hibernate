package com.hibernateRealtions.HibernateRealtions;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Aliens {
	@Id
	private int id;
	private String aname;
	@OneToMany(mappedBy = "aliens")
	private Collection<Laptops> laptops= new ArrayList<Laptops>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Collection<Laptops> getLaptops() {
		return laptops;
	}
	public void setLaptops(Collection<Laptops> laptops) {
		this.laptops = laptops;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", aname=" + aname + ", laptops=" + laptops + "]";
	}
	
	
	

}
