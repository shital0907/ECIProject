package com.tka.ECIController;


import java.util.List;


import com.tka.ECIEntity.candidate;
import com.tka.ECIService.Service;

public class Controller {

	public List<candidate> getAllCandidateList() {
		
		
		System.out.println("We are inside Controller");
		Service service = new Service();
		List<candidate> allcandidatelist = service.getAllCandidateList();
		return  allcandidatelist;
	}

}
