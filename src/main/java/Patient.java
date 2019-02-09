
public class Patient implements HasVitals  {

	private String patientID;
	private String patientName;
	private String ward;
	private int bloodLevel;
	
	
	public Patient(String patientID, String patientName, String ward) {
		
		this.patientID = patientID;
		this.patientName = patientName;
		this.ward = ward;
		this.bloodLevel = BLOOD_LEVEL;
	}
	
	
	public String getPatientID() {
		return patientID;
	}

	public String getPatientName() {
		return patientName;
	}


	public String getWard() {
		return ward;
	}







	
}

