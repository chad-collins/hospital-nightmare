import java.util.Random;

import java.util.Scanner;


public class Hospital {
	Scanner guess = new Scanner(System.in);

	Boolean cleanHospital;

	private boolean vladFound = false;
	

	public Hospital() {
		this.cleanHospital = true;
	}

	
	public static void tickHospital(AllEmployees staff, PatientCollection admitted, Hospital nightmare) {
		admitted.removeDeadPatients();
		admitted.patientTickAll();
		staff.empTickAll();
		admitted.removeDeadPatients();
		nightmare.findVlad();
		nightmare.getVladFound();
	}

	public String getCleanHospital() {
		if (cleanHospital) {
			return "CLEAN & TIDY";
		} else {
			return "FILTHY";
		}
	}
		
	

	public boolean getVladFound() {
		return vladFound;
	}


	public void findVlad() {

		Random r = new Random();
		int chanceToCatch = 1;
//		int chanceToCatch = r.nextInt(1);

		if (chanceToCatch == 1) {

			System.out.println("You find yourself suspecting that something is lurking in one of the rooms."
					+ "Which room will you check? Choose room 1 - 10");
			int userGuess = guess.nextInt();
			guess.nextLine();
			if (userGuess == chanceToCatch) {
				vladFound = true;
					System.out.println("you win.");
			}
		}
	}		
			
		
		
		
	}


//	public int roomNumbers(PatientCollection admitted) {
//		int numOfRooms = admitted.getCollectionLength();
//		return numOfRooms;
//
//	}
//
//	public void findVlad() {
//		Random r = new Random();
//		int chanceToCatch = r.nextInt(10) + 1;
//		if (chanceToCatch == 7) {
//			System.out.println("You find yourself suspecting that something is lurking in either the Psych Ward."
//					+ "Which room will you check? Choose room 1 - " + roomNumbers(admitted) + ".");
//		}
//		// it doesnt like the roomNumbers method in the printLn
//
//	}


