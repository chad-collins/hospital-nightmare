import java.awt.Label;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Hospital nightmare = new Hospital(5, 2);
		/*
		 * Populate the hospital with patients and employees
		 */

		Patient starterPatient1 = new Patient("01", "Freddie", "[Psych Ward]");
		Patient starterPatient2 = new Patient("02", "Miss Giddens", "[Psych Ward]");
		Patient starterPatient3 = new Patient("03", "Jason", "[Psych Ward]");
		Patient starterPatient4 = new Patient("04", "Frank N Furter", "[Psych Ward]");
		Patient starterPatient5 = new Patient("05", "Father McGruder", "[Psych Ward]");
		Patient starterPatient6 = new Patient("06", "Father Karras", "[Psych Ward]");
		Patient starterPatient7 = new Patient("07", "Mrs Voorhees", "[Psych Ward]");
		Patient starterPatient8 = new Patient("08", "Conal Cochran", "[Psych Ward]");
		Patient starterPatient9 = new Patient("09", "Danny Torrance", "[Psych Ward]");


		Patient starterPatient10 = new Patient("10", "Peter Venkman", "[Pain management]");
		Patient starterPatient11 = new Patient("11", "Stevie Wayne", "[Pain management]");
		Patient starterPatient12 = new Patient("12", "The Tall Man", "[Pain management]");
		Patient starterPatient13 = new Patient("13", "Linda", "[Pain management]");
		Patient starterPatient14 = new Patient("14", "Jenny", "[Pain management]");
		Patient starterPatient15 = new Patient("15", "Annie Wilkes", "[Pain management]");
		Patient starterPatient16 = new Patient("16", "Carole Ledoux", "[Pain management]");
		Patient starterPatient17 = new Patient("17", "Michel Delasalle", "[Pain management]");
		Patient starterPatient18 = new Patient("18", "Chris MacNeil", "[Pain management]");

		Employee starterDoctor1 = new Doctor("01", "Dr. Loboto", false, "[Psych Ward]");
		Employee starterDoctor2 = new Doctor("02", "Dr. Asami", false, "[Pain management]");
		Employee starterDoctor3 = new Doctor("03", "Dr. Génessier", true, "[Psych Ward]");


		Employee starterSurgeon1 = new Surgeon("04", "Dr. Pazuzu", true, "[Psych Ward]");
		Employee starterSurgeon2 = new Surgeon("05", "Dr. Slasher", false, "[Pain management]");

		

		Employee starterNurse1 = new Nurse("06", "Nurse Bates", true, "[Psych Ward]");
		Employee starterNurse2 = new Nurse("07", "Nurse Damien", false, "[Pain management]");
		Employee starterNurse3 = new Nurse("08", "Nurse Alex Price", false, "[Psych Ward]");
		Employee starterNurse4 = new Nurse("09", "Nurse Cesare", true, "[Pain management]");

		Employee starterJanitor = new Janitor("10", "Van Helsing", true, 2);
		Employee starterVampireJanitor = new VampireJanitor("13", "Count Orlok", true, 1);

		Employee starterReceptionist = new Receptionist("11", "Pam", true, 1);

		AllEmployees staff = new AllEmployees();

		staff.addEmployee(starterDoctor1);
		staff.addEmployee(starterDoctor2);
		staff.addEmployee(starterDoctor3);
		staff.addEmployee(starterSurgeon1);
		staff.addEmployee(starterSurgeon2);
		staff.addEmployee(starterNurse1);
		staff.addEmployee(starterNurse2);
		staff.addEmployee(starterNurse3);
		staff.addEmployee(starterNurse4);
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
		admitted.addPatient(starterPatient7);
		admitted.addPatient(starterPatient8);
		admitted.addPatient(starterPatient9);
		admitted.addPatient(starterPatient10);
		admitted.addPatient(starterPatient11);
		admitted.addPatient(starterPatient12);
		admitted.addPatient(starterPatient13);
		admitted.addPatient(starterPatient14);
		admitted.addPatient(starterPatient15);
		admitted.addPatient(starterPatient16);
		admitted.addPatient(starterPatient17);
		admitted.addPatient(starterPatient18);
		/*
		 * End pre-population
		 */
		System.out.println(staff.getAllEmployeesLength());
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
		boolean loseCondition = false;
		boolean forfeitCondition = false;
		boolean winCondition = false;

		while (!loseCondition && !forfeitCondition) {

			/*
			 * MAIN MENU BEGINS HERE
			 */
			admitted.checkAllPatientsAlive();
			admitted.removePatients();
			System.out.println(
					"In your office." + "\n-----------------" + "\n1. Get Hospital Status\n2. Review patient log.");
			String mainMenuResponse = input.nextLine();

			switch (mainMenuResponse) {
		
			// Main case 1
			case "1":
				admitted.checkAllPatientsAlive();
				admitted.removePatients();
				System.out.println("\n" 
			+ "CURRENT PATIENT COUNT: " + "[" + admitted.getCollectionLength() + "]"
						+ "\nHOSPITAL STATUS: " + nightmare.getCleanHospital()
						+ "\nCALLS IN QUEUE: " + nightmare.getCallerMood()
						+ "\n-----------------" 
						+ "\n\nALL STAFF" 
						+ "\n-----------------");
				admitted.checkAllPatientsAlive();
				admitted.removePatients();
				staff.allempStatusSummary();
				System.out.println("-----------------\n");

					System.out.println("Make a selection: \n" + "\n-----------------" + "\n1. Dispatch a janitor"
							+ "\n2. Remind the receptionist to take calls" + "\n3. Select an employee ID"
							+ "\n4. Exit to the main menu" + "\n");
					String mainMenuResponse2 = input.nextLine();
					switch (mainMenuResponse2) {
					case "1":
						staff.allAvailJanitors();
						System.out.println(staff.checkJanitorAvailability() + "\nWhich Janitor ID?");
						String whichJanitor = input.nextLine();
						Janitor selectedJanitor = (Janitor) staff.getEmployee(whichJanitor);
						if (selectedJanitor.getIsAvailable() == true) {
							int sweepThisMuch = selectedJanitor.getSweepSkill();
							nightmare.beCleaned(sweepThisMuch);
							System.out.println(selectedJanitor.getEmpName() + " is sweeping.\n________");

							selectedJanitor.busy();
							nightmare.tickHospital(staff, admitted, nightmare);
							break;
						} else {
							System.out.println(selectedJanitor.getEmpName() + "is busy.\n________");
							break;
						} 
					case "2":
						staff.allAvailReceptionists();
						System.out.println(staff.checkReceptionistAvailability() + "\nWhich Receptionist ID?");
						String whichRecept = input.nextLine();
						Receptionist selectedRecept = (Receptionist) staff.getEmployee(whichRecept);
						if (selectedRecept.getIsAvailable() == true) {
							int callsToTake = selectedRecept.getCallSkill();
							nightmare.callsAnswered(callsToTake);
							System.out.println(selectedRecept.getEmpName() + " is taking calls.\n________");
							selectedRecept.busy();
							nightmare.tickHospital(staff, admitted, nightmare);
							break;
						} else {
							System.out.println(selectedRecept.getEmpName() + "is busy.\n________");
							break;
						} 
						
						
					case "3":
						staff.allempStatusSummary();
						System.out.println("Select an employee ID:");
						String whichEmployee = input.nextLine();
						Employee chosenEmployee = staff.getEmployee(whichEmployee);
						System.out.println(chosenEmployee);
						System.out.println("");
						break;// Main menu case 1 break
					case "4":
						break;
					}
					break;
			// Main case 2, Patient Summary top Menu
			case "2":
				admitted.checkAllPatientsAlive();
				admitted.removePatients();
				boolean interactingWithPatientSummary = true;
				while (interactingWithPatientSummary) {

					System.out.println("PATIENT SUMMARY" + "\n-----------------");
					admitted.checkAllPatientsAlive();
					admitted.removePatients();
					admitted.allPatientSummary();
					System.out.println("-----------------\n");

					boolean interactingWithPatientLog = true;
					while (interactingWithPatientLog) {
						admitted.checkAllPatientsAlive();
						admitted.removePatients();
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
							System.out.println("Employee to dispatch? (enter ID#)");
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
								nightmare.tickHospital(staff, admitted, nightmare);
								System.out.println("");
								break;
							} else if (selectedStaff instanceof Surgeon) {
								System.out.println(
										"Surgeons don't get paid to walk the ward." + "\nNo patients were treated.");
								nightmare.tickHospital(staff, admitted, nightmare);

								System.out.println("");
								break;
							} else if (selectedStaff instanceof Nurse) {
								selectedStaff.busy();
								String nurseWard = selectedStaff.getSpecialty();
								if (nurseWard == "[Psych Ward]") {
									admitted.treatAllPsychPatients();
									System.out.println("All Psych Ward patients were treated.");
									System.out.println("");
									nightmare.tickHospital(staff, admitted, nightmare);
									break;
								} else if (nurseWard == "[Pain management]") {
									admitted.treatAllPainMgmtPatients();
									System.out.println("All Pain management patients were treated.");
									System.out.println("");
									nightmare.tickHospital(staff, admitted, nightmare);
									break;
								}
								break;
							}
						case "d":
							System.out.println("Which patient would you like to treat? (enter Room #)");
							admitted.checkAllPatientsAlive();
							admitted.removePatients();
							admitted.allPatientSummary();
							String patientToGet = input.nextLine();
							Patient selectedPatient = admitted.getPatient(patientToGet);
							System.out.println("Which employee should be dispatched to "
									+ selectedPatient.getPatientName() + " ? (enter ID#)");
							staff.allAvailMedical();
							String staffToGetNext = input.nextLine();
							Employee chosenStaff = staff.getEmployee(staffToGetNext);
							chosenStaff.busy();
							if (chosenStaff instanceof Surgeon) {
								System.out.println("Choose: \n1-Infusion \n2-Medication");
								int surgeonTreatment = input.nextInt();
								switch (surgeonTreatment) {
								case 1:
									((Surgeon) chosenStaff).infuse(selectedPatient);
									System.out.println(chosenStaff.getEmpName() + " has saved "
											+ selectedPatient.getPatientName());
									nightmare.tickHospital(staff, admitted, nightmare);

									break;
								case 2:
									((Surgeon) chosenStaff).medicatePatient(selectedPatient);
									System.out.println(chosenStaff.getEmpName() + " has saved "
											+ selectedPatient.getPatientName());
									nightmare.tickHospital(staff, admitted, nightmare);

									break;
								}
							} else if ((chosenStaff instanceof Doctor) && (!(chosenStaff instanceof Surgeon))) {
								chosenStaff.busy();
								System.out.println("Choose: \n1-Infusion \n2-Medication");
								String doctorTreatment = input.nextLine();
								switch (doctorTreatment) {
								case "1":
									((Doctor) chosenStaff).infuse(selectedPatient);
									System.out.println(chosenStaff.getEmpName() + " has saved "
											+ selectedPatient.getPatientName());
									nightmare.tickHospital(staff, admitted, nightmare);
									break;
								case "2":
									((Doctor) chosenStaff).medicatePatient(selectedPatient);
									System.out.println(chosenStaff.getEmpName() + " has saved "
											+ selectedPatient.getPatientName());
									nightmare.tickHospital(staff, admitted, nightmare);
									break;
								}
							} else if (chosenStaff instanceof Nurse) {
								if (!chosenStaff.getSpecialty().equals(selectedPatient.getWard())) {
									System.out.println("The " + chosenStaff.getSpecialty()
											+ " nurse can't treat patients on the " + selectedPatient.getWard()
											+ " ward!" + " " + selectedPatient.getPatientName() + " wasn't treated.");
								} else {
									chosenStaff.busy();
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
								}break;
							} break;
						case "s":
							if (staff.checkSurgeonAvailability() == 0) {
								System.out.println("No surgeons are available.");
								nightmare.tickHospital(staff, admitted, nightmare);

								System.out.println(" ");
								break;
							} else {
								System.out.println("Which patient needs emergency surgery? (enter room #)");
								admitted.checkAllPatientsAlive();
								admitted.removePatients();
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
									chosenSurgeon.busy();
									chosenSurgeon.performsSurgery(selectedSurgeryPatient);
									System.out.println(chosenSurgeon.getEmpName() + " saved patient "
											+ selectedSurgeryPatient.getPatientName());
									nightmare.tickHospital(staff, admitted, nightmare);

								}break;
								}
							
						case "w":
							System.out.println("You've made a selfish choice...");
							nightmare.tickHospital(staff, admitted, nightmare);
							break;
						case "help":
							System.out.println("\n" + "-HELP MENU-"
									+ "\n-Press '1' to display your hospital staff's metrics and availability."
									+ "\n-Press '2' to view patients and begin patient interaction."
									+ "\n-Type 'exit' to exit the game at any time." + "\n");
							break;
						case "exit":
							break;
						default:
							System.out.println("Stop wasting time! There are people dieing here!");
							break;

						}
						break;
					}
					break;
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
						+ "\nPatients will suffer, and you will be haunted by their memory.");
			}
			if (loseCondition) {
				System.out.println("\nYou failed to contain whatever lurked in the hospital. "
						+ "\nYour patients and staff have all been killed under your guidance. "
						+ "\nIn your office a shadowy figure waits for you.");
			}
			if (winCondition) {
			

			}

		}


		Label copyrightL = new Label("\u00a9");
		System.out.println("\nCredits:\n" + "Jessica Wright & Chad Collins\n" + "All Rights Reserved. Â©2019");

	}

	public static boolean checkForWin(Hospital nightmare, boolean winCondition) {
		if (nightmare.getVladFound() == true) {
			winCondition = true;
			return !winCondition;
		} else {
			return winCondition;
		}

	}
}