package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Course;
import com.model.Student;
//import com.model.Student;

public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		//Transaction tx = session.beginTransaction();
		/*Student s = new Student();
		//s.setSid(1);
		s.setSname("ram");
		s.setScity("solapur");*/
		
		/*Course c = new Course();
		c.setCourse("dotNet");
		session.save(c);*/	
		
		Student s = session.get(Student.class, 2);
		Course c = session.get(Course.class, 4);
		Course c1 = session.get(Course.class, 5);
		s.getCourse().add(c);
		s.getCourse().add(c1);
		c.setStudent(s);
		session.saveOrUpdate(s);
		session.saveOrUpdate(c);
		
		/*Student s = session.get(Student.class, 1);
		System.out.println(s);*/
	
		
		
		session.beginTransaction().commit();
	}

}
