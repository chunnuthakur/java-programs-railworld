package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	User u=new User();
    	u.setUid(121);
    	u.setuName("Sneha");
    	
    	Bank b=new Bank();
    	b.setBid(1231);
    	b.setbName("RBL");
    	u.setBank(b);
    	
    	User u1=new User();
    	u1.setUid(122);
    	u1.setuName("Sakshi");
    	
    	Bank b1=new Bank();
    	b1.setBid(12432);
    	b1.setbName("SBI");
    	
    	u1.setBank(b1);
    	Session session=factory.openSession();
  	Transaction tx=session.beginTransaction();
    	session.save(u);
    	session.save(u1);
    	session.save(b);
    	session.save(b1);
    	
        tx.commit();
    	session.close();
    	factory.close();
    	System.out.println("data saved");
    	
    		

    }
}
