package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Boss;
import com.jobs.domain.Junior;
import com.jobs.domain.Manager;
import com.jobs.domain.Mid;
import com.jobs.domain.Senior;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		repository = new EmployeeRepository();
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Boss boss = new Boss(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
		
		System.out.println("Añadido: " + boss + " a la lista");
		System.out.println("Tamaño de la lista:  " + repository.getAllMembers().size());
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Manager manager = new Manager(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		
		System.out.println("Añadido: " + manager + " a la lista");
		System.out.println("Tamaño de la lista:  " + repository.getAllMembers().size());
	}

	public void createJuniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Junior junior = new Junior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateJunior());
		repository.addMember(junior);
		
		System.out.println("Añadido: " + junior + " a la lista");
		System.out.println("Tamaño de la lista:  " + repository.getAllMembers().size());
	}

	public void createMidEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Mid mid = new Mid(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateMid());
		repository.addMember(mid);
		
		System.out.println("Añadido: " + mid + " a la lista");
		System.out.println("Tamaño de la lista:  " + repository.getAllMembers().size());
	}
	
	public void createSeniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Senior senior = new Senior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateSenior());
		repository.addMember(senior);
		
		System.out.println("Añadido: " + senior + " a la lista");
		System.out.println("Tamaño de la lista:  " + repository.getAllMembers().size());
	}
	


	public void createVolunteer(String name, String address, String phone, String description) throws Exception{
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer);
		
		System.out.println("Añadido: " + volunteer + " a la lista");
		System.out.println("Tamaño de la lista:  " + repository.getAllMembers().size());
	}
	
	public void payAllEmployeers() {
		
		for(AbsStaffMember abs: repository.getAllMembers()) {
			abs.pay();
		}
	
	}

	public String getAllEmployees() {
		
		return repository.getAllMembers().toString();
	}
	
}

    
