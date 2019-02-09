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

		Employee starterDoctor1 = new Doctor("07", "Dr. Loboto", true, "[Psych Ward]");
		Employee starterDoctor2 = new Doctor("08", "Dr. Numb", true, "[Pain management]");

		Employee starterSurgeon1 = new Surgeon("09", "Dr. Cuts", false, "[Psych Ward]");
		Employee starterSurgeon2 = new Surgeon("10", "Dr. Slasher ", false, "[Pain management]");

		Employee starterNurse1 = new Nurse("11", "Nurse Bates", true, "[Psych Ward]");
		Employee starterNurse2 = new Nurse("12", "Nurse Damien", true, "[Pain management]");

		Employee starterJanitor = new Janitor("13", "Zeke", true);
		Employee starterVampireJanitor = new VampireJanitor("14", "Vlad", true);

		Employee starterReceptionist = new Receptionist("15", "Pam", true);

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
		
		tickHospital(staff, admitted);

		admitted.addPatient(starterPatient1);
		admitted.addPatient(starterPatient2);
		admitted.addPatient(starterPatient3);
		admitted.addPatient(starterPatient4);
		admitted.addPatient(starterPatient5);
		admitted.addPatient(starterPatient6);
		/*
		 * End pre-population
		 */
		System.out.println("******************\n" + "NIGHTMARE HOSPITAL" + "\n******************" + "\n      v0.13"
				+ "\n------------------");
		System.out.println("\nPress Enter to start...");
		String go = input.nextLine();
		System.out.println(
				"\n\nYou arrive at High Street Hospital ready to take on your new role as the top Administrator....");
		go = input.nextLine();
		System.out.println(
				"\nThe hospital needs your expertise righting the ship. You're excited for this new challenge....");
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

			System.out.println(
					"In your office." + "\n-----------------" + "\n1. Get Hospital Status\n2. Review patient log.");
			String mainMenuResponse = input.nextLine();

			switch (mainMenuResponse) {

			// Main case 1
			case "1":
				System.out.println("\n" + "CURRENT PATIENT COUNT: " + "[" + admitted.getCollectionLength() + "]"
						+ "\n\nSTAFF INFORMATION" + "\n-----------------");
				staff.allempStatusSummary();
				System.out.println("-----------------\n");
				break;// Main menu case 1 break

			// Main case 2, Patient Summary top Menu
			case "2":
				boolean interactingWithPatientSummary = true;
				while (interactingWithPatientSummary) {

					System.out.println("PATIENT SUMMARY" + "\n-----------------");
					admitted.allPatientSummary();
					System.out.println("-----------------\n");

					// PATIENT SUMMARY MENU START
					System.out.println("Reviewing your patient log:\n" + "\n-----------------"
							+ "\nn. Dispatch someone to treat all patients."
							+ "\nd. Dispatch someone to treat a patient in need. "
							+ "\ns. Dispatch someone perform emergency surgury on a patient."
							+ "\nw. Wait in your office and do nothing while those around you suffer.");

					boolean interactingWithPatientLog = true;
					while (interactingWithPatientLog) {

						String patientLogMenu = input.nextLine();
						switch (patientLogMenu) {
						case "n":
							System.out.println("Employee to dispatch?");
							System.out.println("");
							staff.allAvailMedical();
							String staffToGet = input.nextLine();
							Employee selectedStaff = staff.getEmployee(staffToGet);
							if (staffToGet.equals("exit")) {
								break;
							} else if (selectedStaff.getIsAvailable() == false) {
								System.out.println("That employee is not available.");
								System.out.println("");
							} else if (selectedStaff instanceof Doctor) {
								selectedStaff.busy();
								admitted.treatAllPatients();
								System.out.println("All patients were treated.");
								System.out.println("");
							} else if (selectedStaff instanceof Nurse) {
								selectedStaff.busy();
								String nurseWard = selectedStaff.getSpecialty();
								if (nurseWard == "[Psych Ward]") {
									admitted.treatAllPsychPatients();
									System.out.println("All Psych Ward patients were treated.");
									System.out.println("");
									break;
								} else if (nurseWard == "[Pain Management]") {
									admitted.allPainMgmtPatientSummary();
									admitted.treatAllPainMgmtPatients();
									System.out.println("All Pain management patients were treated.");
									System.out.println("");
									break;
								}
								break;
							}
						case "d":
							System.out.println("Which patient would you like to treat?");
							admitted.allPatientSummary();
							String patientToGet = input.nextLine();
							Patient selectedPatient = admitted.getPatient(patientToGet);
							String patientsWard = selectedPatient.getWard();
							System.out.println("Which employee should be dispatched to "
									+ selectedPatient.getPatientName() + " ?");

							String staffToGetNext = input.nextLine();
							//// not complete

							break;// Select Doctor Break

						case "s":
							System.out.println("Which patient needs emergency surgury?");
							break;// Select Patient Break

						case "w":
							System.out.println("You've made a selfish choice...");
							interactingWithPatientLog = false;
							break;// EXIT PATIENT LOG

						// default: System.out.println("Stop wasting time! There are people dieing
						// here!");break;

						}

					}

					break;
				} // Main menu case 2 break

				// Main menu help

			case "help":
				System.out.println(
						"\n" + "-HELP MENU-" + "\n-Press '1' to display your hospital staff's metrics and availability."
								+ "\n-Press '2' to view patients and begin patient interaction."
								+ "\n-Type 'exit' to exit the game at any time." + "\n");

				break;// Main menu case 'help' break

			// Main exit game
			case "exit":
				forfeitCondition = false;
				break;// Main menu exit case

			// Main default case
			default:
				System.out.println("\nPlease try again.\n");
				break;// Main menu default break
			}

		} // GameRunning Loop Ends
		if (!forfeitCondition) {
			System.out.println("\nYou have resigned your duties but kept your life. "
					+ "\nPatients will suffer, and you will be haunted by their memory.");
		}
		if (!loseCondition) {
			System.out.println("\nYou failed to contain whatever lurked in the hospital. "
					+ "\nYour patients and staff have all been killed under your guidance. "
					+ "\nIn your office a shadowy figure waits for you.");
		}
		if (!victoryCondition) {
			System.out.println("\nYou drive a spike into the vampire's heart. "
					+ "\nIt's a long fight, but the vampire turns to dust. "
					+ "\nYou feel relief for the first time since ariving at High Street Hospital. "
					+ "\nThe only injury you receive is a small bite on the back of your neck.");

		}
		System.out.println("\nCredits:\n" + "Jessica Wright & Chad Collins\n");
	}

	public static void tickHospital(AllEmployees staff, PatientCollection admitted) {
		admitted.patientTickAll();
		staff.empTickAll();
	}

}
