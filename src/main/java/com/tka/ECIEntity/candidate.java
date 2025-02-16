package com.tka.ECIEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class candidate {
	
	@Id
	private int id;
	private String name;
	private String partyname;
	private String assembly;
	private String statename;
	private String gender;
	private int age;
	
	public candidate() {
		super();
	}

	public candidate(int id, String name, String partyname, String assembly, String statename, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.partyname = partyname;
		this.assembly = assembly;
		this.statename = statename;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "candidate [id=" + id + ", name=" + name + ", partyname=" + partyname + ", assembly=" + assembly
				+ ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
	

