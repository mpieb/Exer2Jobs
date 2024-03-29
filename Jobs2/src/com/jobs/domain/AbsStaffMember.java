package com.jobs.domain;

public abstract class AbsStaffMember {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid=0;

	private static int COUNTER_MEMBERS = 1;

	public AbsStaffMember(String name, String address, String phone) throws Exception {
		if (name.equals("")) {
			System.err.println("Field name is empty");
			throw new Exception();
		}
			
		if (address.equals("")) {
			System.err.println("Field address is empty");
			throw new Exception();
		}
			
		if (phone.equals("")) {
			System.err.println("Field phone is empty");
			throw new Exception();
		}

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	public abstract void pay();

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getTotalPaid() {
		return totalPaid;
	}

	public void setTotalPaid(double totalPaid) {
		this.totalPaid = totalPaid;
	}

	
	@Override
	public String toString() {
		return "AbsStaffMember [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", totalPaid=" + totalPaid + "]";
	}
	
}

    