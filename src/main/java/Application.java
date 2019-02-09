import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		/*
		 * Populate the hospital with patients and employees
		 */

		Patient starterPatient1 = new Patient("01", "Freddie", "[Psych Ward]");
		Patient starterPatient2 = new Patient("02", "Annabell", "[Psych Ward]");
		Patient starterPatient3 = new Patient("03", "Jason", "[Psych Ward]");

		Patient starterPatient4 = new Patient("04", "Laurie", "[Pain management]");
		Patient starterPatient5 = new Patient("05", "Michael", "[Pain management]");
		Patient starterPatient6 = new Patient("06", "Carrie", "[Pain management]");

		Employee starterDoctor1 = new Doctor("01", "Dr. Loboto", true, "[Psych Ward]");
		Employee starterDoctor2 = new Doctor("02", "Dr. Numb", true, "[Pain management]");

		Employee starterSurgeon1 = new Surgeon("03", "Dr. Cuts", true, "[Psych Ward]");
		Employee starterSurgeon2 = new Surgeon("04", "Dr. Slasher ", true, "[Pain management]");

		Employee starterNurse1 = new Nurse("05", "Nurse Bates", true, "[Psych Ward]");
		Employee starterNurse2 = new Nurse("06", "Nurse Damien", true, "[Pain management]");

		Employee starterJanitor = new Janitor("07", "Zeke", true);
		Employee starterVampireJanitor = new VampireJanitor("08", "Vlad", true);

		Employee starterReceptionist = new Receptionist("09", "Pam", true);

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
		admitted.addPatient(starterPatient4);
		admitted.addPatient(starterPatient5);
		admitted.addPatient(starterPatient6);
		/*
		 * End pre-population
		 */
		System.out.println("******************\n"
				+ "NIGHTMARE HOSPITAL"
				+"\n******************"
				+"\n      v0.13"
				+"\n------------------");
				System.out.println("\nPress Enter to start...");
				String go = input.nextLine();
				System.out.println("\n\nYou arrive at High Street Hospital ready to take on your new role as the top Administrator....");
				go = input.nextLine();
				System.out.println("\nThe hospital needs your expertise righting the ship. You're excited for this new challenge....");
				go = input.nextLine();
				System.out.println("\nFor some reason, some patients are getting sick and having trouble recovering...");
				go = input.nextLine();
				System.out.println("\nYou plan to solve this mystery and save the lives of both your patients and staff.\n\n");
				
		
		boolean victoryCondition = true;
		boolean loseCondition = true;
		boolean forfeitCondition = true;
		while (victoryCondition && loseCondition && forfeitCondition) {

			/*
			 * MAIN MENU BEGINS HERE
			 */

			System.out.println("In your office."
					+"\n-----------------"
					+ "\n1. Get Hospital Status\n2. Review patient log.");
			String mainMenuResponse = input.nextLine();

			switch (mainMenuResponse) {

			// Main case 1
			case "1":
				System.out.println("\n"
						+ "CURRENT PATIENT COUNT: " + "[" + admitted.getCollectionLength() + "]"
						+ "\n\nSTAFF INFORMATION"
						+"\n-----------------");
					staff.allempStatusSummary();
						System.out.println("-----------------\n");
				break;//Main menu case 1 break

			// Main case 2
			case "2":System.out.println("PATIENT SUMMARY"
								+ "\n-----------------");
					admitted.allPatientSummary();
						System.out.println("-----------------\n");
				break;//Main menu case 2 break
				
				// Main menu help
			case "help":
				System.out.println(
						"\n"
						+ "-HELP MENU-"
						+ "\n-Press '1' to display your hospital staff's metrics and availability."
						+ "\n-Press '2' to view patients and begin patient interaction."
						+ "\n-Type 'exit' to exit the game at any time."
						+ "\n");

				break;//Main menu case 'help' break
				

			// Main exit game
				case "exit": 
				forfeitCondition = false;
				break;//Main menu exit case

				// Main default case
			default:
				System.out.println("\nPlease try again.\n");
				break;//Main menu default break
			}

			
			
			
			
			
			
		}//GameRunning Loop Ends
		if(!forfeitCondition) {
		System.out.println("\nYou have resigned your duties but kept your life. "
				+ "\nPatients will suffer, and you will be haunted by their memory.");
	}if (!loseCondition) 
	{System.out.println("\nYou failed to contain whatever lurked in the hospital. "
			+ "\nYour patients and staff have all been killed under your guidance. "
			+ "\nIn your office a shadowy figure waits for you.");
	}if (!victoryCondition)
	{System.out.println("\nYou drive a spike into the vampire's heart. "
			+ "\nIt's a long fight, but the vampire turns to dust. "
			+ "\nYou feel relief for the first time since ariving at High Street Hospital. "
			+ "\nThe only injury you receive is a small bite on the back of your neck.");
	
	}System.out.println("\nCredits:\n"
			+ "Jessica Wright & Chad Collins\n");
	}

}
