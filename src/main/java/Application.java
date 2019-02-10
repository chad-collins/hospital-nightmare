import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Hospital nightmare = new Hospital();
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

//		tickHospital(staff, admitted);

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
				"\nYou arrive at High Street Hospital ready to take on your new role as the top Administrator....");
		go = input.nextLine();
		System.out.println(
				"The hospital needs your expertise righting the ship. You're excited for this new challenge....");
		go = input.nextLine();
		System.out.println("For some reason, some patients are getting sick and having trouble recovering...");
		go = input.nextLine();
		System.out.println("You plan to solve this mystery and save the lives of both your patients and staff.\n\n");
		System.out.println("At any time, press \"help\" to learn more or \"exit\" to quit the game");
		boolean victoryCondition = false;
		boolean loseCondition = false;
		boolean forfeitCondition = false;
		while (!victoryCondition && !loseCondition && !forfeitCondition) {

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
						+ "\n\nHOSPITAL STATUS: " + nightmare.getCleanHospital() + "\n-----------------"
						+ "\n\nSTAFF INFORMATION" + "\n-----------------");
				System.out.println("");
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

					boolean interactingWithPatientLog = true;
					while (interactingWithPatientLog) {
						// PATIENT SUMMARY MENU START
						System.out.println("Reviewing your patient log:\n" + "\n-----------------"
								+ "\nn. Dispatch someone to treat all patients."
								+ "\nd. Dispatch someone to treat a patient in need. "
								+ "\ns. Dispatch someone perform emergency surgury on a patient."
								+ "\nw. Wait in your office and do nothing while those around you suffer.");

						String patientLogMenu = input.nextLine();
						switch (patientLogMenu) {
						case "n":
							int countOfAvailableMedicalStaff = staff.checkStaffAvailability();
							if (countOfAvailableMedicalStaff == 0) {
								System.out.println("There are no staff available.");
								System.out.println("");
								break;
							}
							System.out.println("Employee to dispatch?");
							System.out.println("");
							staff.allAvailMedical();
							String staffToGet = input.nextLine();
							Employee selectedStaff = staff.getEmployee(staffToGet);
							if (staffToGet.equals("exit")) {
								break;
							} else if (staffToGet.equals("help")) {
								System.out.println("\n" + "-HELP MENU-"
										+ "\n-Press '1' to display your hospital staff's metrics and availability."
										+ "\n-Press '2' to view patients and begin patient interaction."
										+ "\n-Type 'exit' to exit the game at any time." + "\n");
								break;
							} else if (selectedStaff.getIsAvailable() == false) {
								System.out.println("That employee is not available.");
								System.out.println("");
								break;
							} else if ((selectedStaff instanceof Doctor) && (!(selectedStaff instanceof Surgeon))) {
								selectedStaff.busy();
								admitted.treatAllPatients();
								System.out.println("All patients were treated.");
								nightmare.tickHospital(staff, admitted);
								System.out.println("");
								break;
							} else if (selectedStaff instanceof Surgeon) {
								System.out.println(
										"Surgeons don't get paid to walk the ward." + "\nNo patients were treated.");
								nightmare.tickHospital(staff, admitted);
								System.out.println("");
								break;
							} else if (selectedStaff instanceof Nurse) {
								selectedStaff.busy();
								String nurseWard = selectedStaff.getSpecialty();
								if (nurseWard == "[Psych Ward]") {
									admitted.treatAllPsychPatients();
									System.out.println("All Psych Ward patients were treated.");
									System.out.println("");
									nightmare.tickHospital(staff, admitted);
									break;
								} else if (nurseWard == "[Pain Management]") {
									admitted.allPainMgmtPatientSummary();
									admitted.treatAllPainMgmtPatients();
									System.out.println("All Pain management patients were treated.");
									System.out.println("");
									nightmare.tickHospital(staff, admitted);
									break;
								}
								break;
							}
						case "d":
							System.out.println("Which patient would you like to treat?");
							admitted.allPatientSummary();
							String patientToGet = input.nextLine();
							Patient selectedPatient = admitted.getPatient(patientToGet);
							System.out.println("Which employee should be dispatched to "
									+ selectedPatient.getPatientName() + " ?");
							staff.allAvailMedical();
							String staffToGetNext = input.nextLine();
							Employee chosenStaff = staff.getEmployee(staffToGetNext);
							if (chosenStaff instanceof Surgeon) {
								System.out.println("Choose: \n1-Infusion \n2-Medication");
								int surgeonTreatment = input.nextInt();
								switch (surgeonTreatment) {
								case 1:
									((Surgeon) chosenStaff).infuse(selectedPatient);
									System.out.println(chosenStaff.getEmpName() + " has saved "
											+ selectedPatient.getPatientName());
									break;
								case 2:
									((Surgeon) chosenStaff).medicatePatient(selectedPatient);
									System.out.println(chosenStaff.getEmpName() + " has saved "
											+ selectedPatient.getPatientName());
									break;
								}
							} else if (chosenStaff instanceof Doctor) {
								System.out.println("Choose: \n1-Infusion \n2-Medication");
								String doctorTreatment = input.nextLine();
								switch (doctorTreatment) {
								case "1":
									((Doctor) chosenStaff).infuse(selectedPatient);
									System.out.println(chosenStaff.getEmpName() + " has saved "
											+ selectedPatient.getPatientName());
									break;
								case "2":
									((Doctor) chosenStaff).medicatePatient(selectedPatient);
									System.out.println(chosenStaff.getEmpName() + " has saved "
											+ selectedPatient.getPatientName());
									break;
								}
							} else if (chosenStaff instanceof Nurse) {
								if (!chosenStaff.getSpecialty().equals(selectedPatient.getWard())) {
									System.out.println(
											"The " + chosenStaff.getSpecialty() + " nurse can't treat patients on the "
													+ selectedPatient.getWard() + " ward!" + " " +
											selectedPatient.getPatientName() + " wasn't treated.");
								} else {
									System.out.println("Choose: \n1-Infusion \n2-Medication");
									String NurseTreatment = input.nextLine();
									switch (NurseTreatment) {
									case "1":
										System.out.println("Nurses aren't trained in infusion!");
										break;
									case "2":
										((Nurse) chosenStaff).medicatePatient(selectedPatient);
										System.out.println(chosenStaff.getEmpName() + " has treated "
												+ selectedPatient.getPatientName());
										break;
									}
								} break;
								}
						case "s":
							if (staff.checkSurgeonAvailability() == 0) {
								System.out.println("No surgeons are available.");
								nightmare.tickHospital(staff, admitted);
								System.out.println(" ");
								break;
							} else {
								System.out.println("Which patient needs emergency surgery?");
								admitted.allPatientSummary();
								String patientForSurgery = input.nextLine();
								Patient selectedSurgeryPatient = admitted.getPatient(patientForSurgery);
								System.out.println("Which surgeon should be dispatched to "
										+ selectedSurgeryPatient.getPatientName() + " ?");
								staff.allAvailSurgeons();
								String selectedSurgeon = input.nextLine();
								Surgeon chosenSurgeon = (Surgeon) staff.getEmployee(selectedSurgeon);
								if (chosenSurgeon.getIsAvailable() == false) {
									System.out.println(chosenSurgeon.getEmpName() + " is not available.");
									break;
								} else {
									chosenSurgeon.performsSurgery(selectedSurgeryPatient);
									System.out.println(chosenSurgeon.getEmpName() + " saved patient " + selectedSurgeryPatient.getPatientName());
									break;
								}
							}
						case "w":
							System.out.println("You've made a selfish choice...");
							interactingWithPatientSummary = false;
							break;
						case "help":
							System.out.println("\n" + "-HELP MENU-"
									+ "\n-Press '1' to display your hospital staff's metrics and availability."
									+ "\n-Press '2' to view patients and begin patient interaction."
									+ "\n-Type 'exit' to exit the game at any time." + "\n");
							break;
//							This exit option isn't working.
//						case "exit":
//							interactingWithPatientLog = false;
//							forfeitCondition = true;
//							break;
						default:
							System.out.println("Stop wasting time! There are people dieing here!");
							break;

						}
						break;
					}
				}
			case "help":
				System.out.println(
						"\n" + "-HELP MENU-" + "\n-Press '1' to display your hospital staff's metrics and availability."
								+ "\n-Press '2' to view patients and begin patient interaction."
								+ "\n-Type 'exit' to exit the game at any time." + "\n");
				break;
			case "exit":
				forfeitCondition = true;
				break;
			default:
				System.out.println("\nPlease try again.\n");
				break;
			}

			// GameRunning Loop Ends
			if (forfeitCondition)

			{
				System.out.println("\nYou have resigned your duties but kept your life. "
						+ "\nPatients will suffer, and you will be haunted by their memory."
						+ "\nCredits: Jessica Wright & Chad Collins\n");
			}
			if (loseCondition) {
				System.out.println("\nYou failed to contain whatever lurked in the hospital. "
						+ "\nYour patients and staff have all been killed under your guidance. "
						+ "\nIn your office a shadowy figure waits for you."
						+ "\nCredits: Jessica Wright & Chad Collins\n");
			}
			if (victoryCondition) {
				System.out.println("\nYou drive a spike into the vampire's heart. "
						+ "\nIt's a long fight, but the vampire turns to dust. "
						+ "\nYou feel relief for the first time since ariving at High Street Hospital. "
						+ "\nThe only injury you receive is a small bite on the back of your neck."
						+ "\nCredits: Jessica Wright & Chad Collins\n");

			}
			
		}
	}
}
