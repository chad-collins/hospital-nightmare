
public class Patient implements HasVitals  {

	private int patientID;
	private String patientName;
	private String ward;
	private int bloodLevel;
	
	
	public Patient(int patientID, String patientName, String ward) {
		
		this.patientID = patientID;
		this.patientName = patientName;
		this.ward = ward;
		this.bloodLevel = BLOOD_LEVEL;
	}
	
	
	public int getPatientID() {
		return patientID;
	}

	public String getPatientName() {
		return patientName;
	}


	public String getWard() {
		return ward;
	}


	
	@Override
	public void drawBlood() {
	bloodLevel -= 5;
		
		
	}


	
}

