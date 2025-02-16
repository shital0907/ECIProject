package com.tka.ECIService;

import java.util.List;

import com.tka.ECIDao.Dao;
import com.tka.ECIEntity.candidate;

public class Service {

	public List<candidate> getAllCandidateList() {
		System.out.println("We are inside Service");
		Dao dao = new Dao();
		List<candidate> allcandidatelist = dao. getAllCandidateList();
		return  allcandidatelist;
	}

}
