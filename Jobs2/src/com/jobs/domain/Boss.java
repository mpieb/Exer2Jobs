package com.jobs.domain;

import exceptions.SueldoBossException;

public class Boss extends Employee{

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	
	public Boss(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception {
		
		super(name, address, phone, salaryPerMonth, paymentRate);		
		if(salaryPerMonth<0) {
			System.err.println("Salary per month cannot be less than 0");
			throw new Exception();
		}
		if(salaryPerMonth<8000) throw new SueldoBossException();
		if(paymentRate==null) {
			System.err.println("Payment Rate must exist. It cannot be null");
			throw new Exception();
		}
				
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
		return "Boss [id=" + id + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + ", salaryPerMonth=" + salaryPerMonth + ", totalPaid=" + totalPaid + "]";
	}
	
}

   



