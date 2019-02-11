import java.awt.Label;
import java.util.Random;

import java.util.Scanner;

public class Hospital {
	Scanner guess = new Scanner(System.in);

	int cleanHospital;
	int phoneQueue;

	private boolean vladFound = false;

	public Hospital(int cleanHospital, int phoneQueue) {
		this.cleanHospital = 5;
		this.phoneQueue = 2;
	}

	public int getPhoneQueue() {
		return phoneQueue;
	}

	public void tickHospital(AllEmployees staff, PatientCollection admitted, Hospital nightmare) {
		admitted.removeDeadPatients();
		staff.empTickAll();
		admitted.removeDeadPatients();
		nightmare.phoneQueue += 1;
		nightmare.cleanHospital -= 1;
		admitted.patientTickAll();

		findVlad();
		if (vladFound == false) {
			admitted.patientsTickBite();
		}
		if (vladFound == true) {
			staff.remove("13");

			System.out.println("\nYou drive a spike into the vampire's heart. "
					+ "\nIt's a long fight, but the vampire turns to dust. "
					+ "\nYou feel relief for the first time since ariving at High Street Hospital. "
					+ "\nThe only injury you receive is a small bite on the back of your neck.");
			System.out.println("\nCredits:\n" + "Jessica Wright & Chad Collins\n" + "All Rights Reserved. Â©2019");
		}
	}

	public String getCallerMood() {
		if (phoneQueue >= 5) {
			return phoneQueue + " callers in queue. Extremely long hold times.";
		} else if (cleanHospital >= 4) {
			return phoneQueue + " callers in queue. 10 minute hold time.";
		} else if (cleanHospital >= 2) {
			return phoneQueue + " callers in queue. 5 minute hold time.";
		} else if (cleanHospital >= 1) {
			return phoneQueue + " callers in queue. 2 minute hold time.";
		} else
			return phoneQueue + " callers in queue. No hold time.";
	}

	public String getCleanHospital() {
		if (cleanHospital >= 9) {
			return "VERY CLEAN - 5 STAR RATING";
		} else if (cleanHospital >= 8) {
			return "CLEAN - 4 STAR RATING";
		} else if (cleanHospital >= 7) {
			return "NOT VERY CLEAN - 3 STAR RATING";
		} else if (cleanHospital >= 6) {
			return "DIRTY - 2 STAR RATING";
		} else
			return "FILTHY - BLOOD EVERYWHERE - FORCLOSURE EXPECTED SOON.";
	}

	public void beCleaned(int s) {
		this.cleanHospital += s;
	}

	public void callsAnswered(int c) {
		this.phoneQueue -= c;
	}

	public boolean getVladFound() {
		return vladFound;
	}

	public void findVlad() {

		Random r = new Random();
		int chanceToCatch = r.nextInt(10);
		if (chanceToCatch == 7) {

			System.out.println("You find yourself suspecting that something is lurking in one of the rooms."
					+ "Which room will you check? Choose room 1 - 10");
			int userGuess = guess.nextInt();

			Random newr = new Random();
			int newRoom = newr.nextInt(10);

			guess.nextLine();
			if (userGuess == newRoom) {
				vladFound = true;
				System.out.println("What... what..is this....." + "\n" + "\n" + "\n" + "\n");
			} else {
				System.out.println("Hmmm..nothing unusual here.");
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
