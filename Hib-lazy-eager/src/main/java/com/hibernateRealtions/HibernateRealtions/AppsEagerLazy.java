package com.hibernateRealtions.HibernateRealtions;

import java.util.Collection;

import org.aspectj.weaver.reflect.Java14GenericSignatureInformationProvider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.sqm.sql.BaseSqmToSqlAstConverter.AdditionalInsertValues;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.internal.SessionFactoryServiceRegistryBuilderImpl;

public class AppsEagerLazy {

    public static void main(String[] args) {
        Configuration con= new Configuration().configure().addAnnotatedClass(Laptops.class).addAnnotatedClass(Aliens.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        Aliens aliens=session.get(Aliens.class,1);
        System.out.println(aliens.getAname());
        Collection<Laptops> laptops=aliens.getLaptops();
        for(Laptops laps:laptops)
        	System.out.println(laps);
        System.out.println("Hi");
        System.out.println(aliens);
        session.getTransaction().commit();

        
    }
}
