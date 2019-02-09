
public class Application {

	public static void main(String[] args) {
		
		/*
		 * Start by populating the hospital with patients and employees
		 */
		
		Patient starterPatient1 = new Patient("1", "Freddie" , "Psych Ward");
		Patient starterPatient2 = new Patient("2", "Annabell" , "Psych Ward");
		Patient starterPatient3 = new Patient("3", "Jason" , "Psych Ward");
		
		Patient starterPatient4 = new Patient("1", "Laurie" , "Pain management");
		Patient starterPatient5 = new Patient("2", "Michael" , "Pain management");
		Patient starterPatient6 = new Patient("3", "Carrie" , "Pain management");
		
		Employee starterDoctor1 = new Doctor("4", "Dr. Loboto" , true, "Psych Ward");
		Employee starterDoctor2 = new Doctor("5", "Dr. Numb" , true, "Pain Management");
		
		Employee starterSurgeon1= new Surgeon("6", "Dr. Cuts" , true, "Psych Ward");
		Employee starterSurgeon2= new Surgeon("7", "Dr. Slasher" , true, "Pain Management");
		
		Employee starterNurse1= new Nurse("8", "Nurse Bates" , true, "Psych Ward");
		Employee starterNurse2= new Nurse("9", "Nurse Damien " , true, "Pain Management");
	
		
		
		
		
		
		System.out.println("Welcome message placeholder");
		
		
		
		
		
	}

}
