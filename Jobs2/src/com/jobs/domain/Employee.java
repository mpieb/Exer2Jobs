package com.jobs.domain;

public abstract class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		
		super(name, address, phone);		
		if(salaryPerMonth<0) {
			System.err.println("Salary per month cannot be less than 0");
			throw new Exception();
		}
		if(paymentRate==null) {
			System.err.println("Payment Rate must exist. It cannot be null");
			throw new Exception();
		}
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}
	/*
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + ", salaryPerMonth=" + salaryPerMonth + ", totalPaid=" + totalPaid + "]";
	}*/

}

    


