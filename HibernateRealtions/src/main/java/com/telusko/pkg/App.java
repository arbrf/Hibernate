package com.telusko.pkg;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.NativeQuery;
public class App {

    public static void main(String[] args) {
    	int b=60;
        // TODO Auto-generated method stub
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
      Query query=session.createQuery("select rollno,name,marks from Student s where s.marks>:b");
      query.setParameter("b",b);
     List<Object[]> studentObjectArr=(List<Object[]>) query.list();
     
     for(Object[] student:studentObjectArr)
    System.out.println(student[0]+" : "+student[1]+" : "+student[2]);
        session.getTransaction().commit();
        session.close(); // Close the session after the transaction is complete
        sessionFactory.close(); // Close the session factory
    }
}
