import java.util.HashMap;

public class PatientCollection {

	private HashMap<String, Patient> patients = new HashMap<String, Patient>();

	public int getCollectionLength() {
		return patients.size();
	}

	// Changed patient getter from a void method in order to return a patient
	public Patient getPatient(String patientID) {
		return patients.get(patientID);

	}

	public void addPatient(Patient x) {
		patients.put(x.getPatientID(), x);
	}

	public void removePatient(String patientToRemove) {
		for (Patient patient : patients.values()) {
			if (patient.getHealthLevel() <= 0) {
				patientToRemove = patient.getPatientID();
				patients.remove(patientToRemove);
				System.out.println("Patient #" + patientToRemove + " has passed away.");
			}
		}

	}

	public void infuseAllPatients() {
		for (Patient patient : patients.values()) {

		}
	}
	
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
				;
				break;
			}
		}
	}
	
	public void patientTickAll() {
		for (Patient patient : patients.values()) {
			patient.patientTick();
		}

	}

}
