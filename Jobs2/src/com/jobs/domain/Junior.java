package com.jobs.domain;

import exceptions.SueldoJuniorException;

public class Junior extends Employee{

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	
	public Junior(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		
		if(salaryPerMonth<900 || salaryPerMonth>1600) throw new SueldoJuniorException();
		if(paymentRate==null) throw new Exception("Field payment rate cannot must exist");
		
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	
	
	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}



	public void setSalaryPerMonth(double salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}



	public IPaymentRate getPaymentRate() {
		return paymentRate;
	}



	public void setPaymentRate(IPaymentRate paymentRate) {
		this.paymentRate = paymentRate;
	}



	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}
	
	@Override
	public String toString() {
		return "Junior [id=" + id + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + ", salaryPerMonth=" + salaryPerMonth + ", totalPaid=" + totalPaid + "]";
	}

}

    



