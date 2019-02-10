import java.util.HashMap;



public class PatientCollection {
	
	private HashMap<String, Patient> patients = new HashMap<String, Patient>();
	

	public int getCollectionLength() {
		return patients.size();
	}

	public Patient getPatient(String patientID) {
		return patients.get(patientID);

	}

	public void addPatient(Patient x) {
		patients.put(x.getPatientID(), x);
	}
	
<<<<<<< HEAD
=======
	public void remove(String patientID) {
		patients.remove(patientID);
	}

	public void removeDeadPatients() {
		for (Patient patient : patients.values()) {
			if (patient.getIsDead() == true) {
				patients.remove(patient.getPatientID());
				System.out.println("Patient " + patient.getPatientName() + " has passed away.");
			}
		}

	}

	public void infuseAllPatients() {
		for (Patient patient : patients.values()) {

		}
	}

>>>>>>> b3a233fc490e1a4e38d4d49c34e08b6a805178d2
	public void treatAllPatients() {
		for (Patient patient : patients.values()) {
			patient.treatPatient();
		}
	}

	public void allPatientSummary() {
		for (Patient patient : patients.values()) {

			patient.patientSummary();
			;
		}
	}

	public void allPsychPatientSummary() {
		for (Patient patient : patients.values()) {
			while (patient.getWard().equals("[Psych Ward]")) {
				patient.patientSummary();
				;
				break;
			}
		}
	}

	public void allPainMgmtPatientSummary() {
		for (Patient patient : patients.values()) {
			while (patient.getWard().equals("[Pain management]")) {
				patient.patientSummary();
				break;
			}
		}
	}

	public void treatAllPsychPatients() {
		for (Patient patient : patients.values()) {
			while (patient.getWard().equals("[Psych Ward]")) {
				patient.treatPatient();
				break;
			}
		}
	}

	public void treatAllPainMgmtPatients() {
		for (Patient patient : patients.values()) {
			while (patient.getWard().equals("[Pain management]")) {
				patient.treatPatient();
				break;
			}
		}
	}

	public void patientTickAll() {
		for (Patient patient : patients.values()) {
			removeDeadPatients();
		}

	}

	public void remove() {
		String patientToRemove = "";
		for (Patient patient : patients.values()) {
			if (patient.getBloodLevel() <= 0) {
				patientToRemove = patient.getPatientID();
			} 
		} patients.remove(patientToRemove);
		
	}

}

	


