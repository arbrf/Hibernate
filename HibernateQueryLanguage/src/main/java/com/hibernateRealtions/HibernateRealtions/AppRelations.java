package com.hibernateRealtions.HibernateRealtions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.internal.SessionFactoryServiceRegistryBuilderImpl;

public class AppRelations {

    public static void main(String[] args) {
        // Create SessionFactory (from hibernate.cfg.xml)
        

        // Create Laptop object and set values
        Laptop laptop = new Laptop();
        laptop.setId(1);
        laptop.setLname("Dell");

        // Create Student object and set values
        Student student = new Student();
        student.setRollno(101);
        student.setName("John Doe");
        student.setMarks(90);
        student.getLaptop().add(laptop);
        
        laptop.getStudent().add(student);
        
        Configuration con= new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(laptop);
        session.save(student);
        transaction.commit();
       

        
    }
}
