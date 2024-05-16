package com.hiber.imagefile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.util.HibernateUtil;
public class App 
{
    public static void main( String[] args )
    {
    	 //get SessionFactory
        SessionFactory factory = HibernateUtil.getSessionFactory();
        //get the session
        Session ses = HibernateUtil.getSession();
        try (factory; ses) {
            //read the photo
            File file1 = new File("C:\\Users\\THAKUR JI\\OneDrive\\Desktop");
            InputStream ip = new FileInputStream(file1);
            byte[] photo = new byte[(int) file1.length()];
            ip.read(photo);


            //read resume
            File file2 = new File("C:\Users\THAKUR JI\OneDrive\Desktop");
            Reader reader = new FileReader(file2);
            char[] resume = new char[(int) file2.length()];
            reader.read(resume);

            //creat the emp obj
            Employee emp = new Employee();
            emp.setEmpName("SAM");
            emp.setPhoto(photo);
            emp.setResume(resume);

            //save this obj


            //begin the tx
            ses.beginTransaction();

            ses.save(emp);

            //commit the tx
            ses.getTransaction().commit();

        } catch (HibernateException he) {
            he.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
