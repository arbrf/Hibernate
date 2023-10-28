package com.telusko.pkg.hib.obj;

import java.util.Objects;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
	    Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
	    SessionFactory sf = con.buildSessionFactory();
	    Session session = sf.openSession();
	    session.beginTransaction();
	   Laptop laptop=new Laptop();
	  
	   Laptop objects=session.get(Laptop.class, 6);
	   System.out.println(objects);
	  
	    session.getTransaction().commit();
	    
	    session.close();
	}


}
