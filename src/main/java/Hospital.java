import java.util.Random;

public class Hospital {

	Boolean cleanHospital;

	public Hospital() {
		this.cleanHospital = true;
	}

	public static void tickHospital(AllEmployees staff, PatientCollection admitted) {
		admitted.removeDeadPatients();
		admitted.patientTickAll();
		staff.empTickAll();
	}

	public String getCleanHospital() {
		if (cleanHospital) {
			return "CLEAN & TIDY";
		} else {
			return "FILTHY";
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
}
