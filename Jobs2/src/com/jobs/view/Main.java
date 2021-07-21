package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Cerimonios 2", "254783659", 9000.0);
		controller.createBossEmployee("Coque Boss", "Del Pecat 23", "874254588", 14000.0);
		controller.createManagerEmployee("Pere Manager", "Bonaire 15", "147582324", 4000.0);
		controller.createManagerEmployee("Xufo Manager", "Dichòs 2", "458965214", 3500.0);
		controller.createJuniorEmployee("Toño Junior", "Manel Peraire 54", "249853247", 1100.0);
		controller.createJuniorEmployee("Rufo Junior", "Difunt Manel 4", "547614825", 990.0);
		controller.createMidEmployee("Tita Mid", "Horxata 1", "610941529", 1900.0);
		controller.createMidEmployee("Doña Mid", "Hortensia 9", "523147825", 2400.0);
		controller.createSeniorEmployee("Nono Senior", "Garbi 6" , "636636636", 2900.0);
		controller.createSeniorEmployee("Tabola Senior", "Can Regatera 4" , "297631853", 3500.0);
		controller.createVolunteer("Xafo Volunteer", "Minsó 9", "666666666", "Es voluntario, no cobra");
		
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: " + allEmployees + " \n");
		
	}

}

    




