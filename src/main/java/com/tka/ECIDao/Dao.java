package com.tka.ECIDao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tka.ECIEntity.candidate;

public class Dao {

	public List<candidate> getAllCandidateList() {
		System.out.println("We are inside Dao");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernatemysql.cfg.xml");

		cfg.addAnnotatedClass(candidate.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		
		//select*from candidate
		Criteria criteria = session.createCriteria(candidate.class);
		
		
		
		
		
		
		List<candidate>listofcandidates=criteria.list();
		return listofcandidates;
	}

}
