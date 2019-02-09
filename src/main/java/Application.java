
public class Application {

	public static void main(String[] args) {
		
		/*
		 * Populate the hospital with patients and employees
		 */
		
		Patient starterPatient1 = new Patient("01", "Freddie" , "[Psych Ward]");
		Patient starterPatient2 = new Patient("02", "Annabell" , "[Psych Ward]");
		Patient starterPatient3 = new Patient("03", "Jason" , "[Psych Ward]");
		
		Patient starterPatient4 = new Patient("04", "Laurie" , "[Pain management]");
		Patient starterPatient5 = new Patient("05", "Michael" , "[Pain management]");
		Patient starterPatient6 = new Patient("06", "Carrie" , "[Pain management]");
		
		Employee starterDoctor1 = new Doctor("01", "Dr. Loboto" , true, "[Psych Ward]");
		Employee starterDoctor2 = new Doctor("02", "Dr. Numb" , true, "[Pain management]");
		
		Employee starterSurgeon1= new Surgeon("03", "Dr. Cuts" , true, "[Psych Ward]");
		Employee starterSurgeon2= new Surgeon("04", "Dr. Slasher " , true, "[Pain management]");
		
		Employee starterNurse1= new Nurse("05", "Nurse Bates" , true, "[Psych Ward]");
		Employee starterNurse2= new Nurse("06", "Nurse Damien" , true, "[Pain management]");
	
		Employee starterJanitor= new Janitor("07", "Zeke" , true);
		Employee starterVampireJanitor = new VampireJanitor("08", "Vlad" , true);
		
		Employee starterReceptionist= new Receptionist("09", "Pam" , true);
		
		
		
		AllEmployees staff = new AllEmployees();
		
		staff.addEmployee(starterDoctor1);
		staff.addEmployee(starterDoctor2);
		staff.addEmployee(starterSurgeon1);
		staff.addEmployee(starterSurgeon2);
		staff.addEmployee(starterNurse1);
		staff.addEmployee(starterNurse2);
		staff.addEmployee(starterJanitor);
		staff.addEmployee(starterVampireJanitor);
		staff.addEmployee(starterReceptionist);
		
		PatientCollection admitted = new PatientCollection();
		
		admitted.addPatient(starterPatient1);
		admitted.addPatient(starterPatient2);
		admitted.addPatient(starterPatient3);
		
		/*
		 * End pre-population
		 */
		System.out.println("Welcome message placeholder");
		
		staff.allempStatusSummary();//test
		
		
		
	}

}
