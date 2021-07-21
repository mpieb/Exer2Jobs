package com.jobs.domain;

import exceptions.SueldoMidException;

public class Mid extends Employee{

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	
	public Mid(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		
		if(salaryPerMonth<1800 || salaryPerMonth>2500) throw new SueldoMidException();
		if(paymentRate==null) throw new Exception();
		
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
		return "Mid [id=" + id + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + ", salaryPerMonth=" + salaryPerMonth + ", totalPaid=" + totalPaid + "]";
	}
}

    

