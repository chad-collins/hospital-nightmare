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
	
	public void removePatients() {
		String patientToRemove = "";
		for (Patient patient : patients.values()) {
			patient.checkIfDead();
			if (patient.getIsDead() == true) {
				patientToRemove = patient.getPatientID();
				System.out.println("*Patient " + patient.getPatientName() + "'s remains have been removed.*\n");
			}
		}
		patients.remove(patientToRemove);
		

	}

	public void treatAllPatients() {
		for (Patient patient : patients.values()) {
			patient.treatPatient();
		}
	}

	public void allPatientSummary() {
		for (Patient patient : patients.values()) {
			patient.patientSummary();
			
		}
	}

	public void allPsychPatientSummary() {
		for (Patient patient : patients.values()) {
			while (patient.getWard().equals("[Psych Ward]")) {
				patient.patientSummary();
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

	public void tickAllPatientsNoBite() {
		for (Patient patient : patients.values()) {
			patient.checkIfDead();
			patient.patientTick();
			removePatients();
			
			
		}

	}
	public void tickTryToBiteAllPatients() {
		for (Patient patient : patients.values()) {
			patient.chanceIncounter();
			

			
			
		}

	}
	
	public void checkAllPatientsAlive() {
		for (Patient patient : patients.values()) {
			patient.getHealthLevel();
			patient.checkIfDead();
			
			
		}

	}
}

	


