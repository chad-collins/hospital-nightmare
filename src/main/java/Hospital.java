
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
}
