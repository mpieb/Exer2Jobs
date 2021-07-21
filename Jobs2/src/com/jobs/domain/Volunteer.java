package com.jobs.domain;

import exceptions.SueldoVolunteerException;

public class Volunteer extends AbsStaffMember {

	protected String description;

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		
		super(name, address, phone);
		
		if(description.equals("")) {
			System.err.println("Description cannot be an empty field");
			throw new Exception();
		}
		
		if(super.totalPaid>0) throw new SueldoVolunteerException();
		this.description = description;
	}

	
	
	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public void pay() {
		this.totalPaid = 0;
		
	}
	@Override
	public String toString() {
		return "Volunteer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", description= " + description
				+ ", totalPaid=" + totalPaid + "]";
	}

}

    

