package com.telusko.HibernatePart_2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Alien alien=new Alien(); 
    	alien.setAcolor("Harsh");
    	alien.setAid(3);
    	alien.setAname("Cyan");
    	Configuration configuration=new Configuration().configure().addAnnotatedClass(Alien.class);
    	SessionFactory sFactory=configuration.buildSessionFactory();
    
    	Session session=sFactory.openSession();
    	Transaction txTransaction=session.beginTransaction();
    	session.save(alien);
    	txTransaction.commit();
   
  
       
    }
}
