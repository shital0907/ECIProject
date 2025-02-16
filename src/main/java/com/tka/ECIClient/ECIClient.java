package com.tka.ECIClient;

import java.util.List;

import com.tka.ECIController.Controller;
import com.tka.ECIEntity.candidate;

public class ECIClient {
	public static void main(String[] args) {
		Controller controller = new Controller();
		System.out.println("We are in client");
		List<candidate> allcandidatelist = controller.getAllCandidateList();

		for (candidate candidate :allcandidatelist ) {
		System.out.println(candidate);
	}
		
	//	List<candidate> allcandidatelist = controller.getAllCandidateList();
	//	List<candidate> allmalecandidatelist = controller.getAllmaleCandidateList();
	//	List<candidate> allfemalecandidatelist = controller.getAllfemaleCandidateList();
	//	List<candidate> allbjpcandidatelist = controller.getAllBJPCandidateList();
	//	List<candidate> allNCPcandidatelist = controller.getAllNCPCandidateList();


	}
}
