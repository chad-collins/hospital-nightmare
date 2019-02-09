
public class Patient implements HasVitals {

	private String patientID;
	private String patientName;
	private String ward;
	private int bloodLevel;
	private int healthLevel;

	public Patient(String patientID, String patientName, String ward) {

		this.patientID = patientID;
		this.patientName = patientName;
		this.ward = ward;
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
	}

	
	public void patientSummary() {
		System.out.println(
				
				"[Room#:" + this.getPatientID() 
				+ "]\t[Name: " + this.getPatientName() 
				+ "]\t[Ward:" + this.getWard() 
				+ "]\t[Health Rating" + this.getHealthLevel() 
				+ "]\t[Blood Level: " + this.getBloodLevel()
				+ "]\n");
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

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		if (this.bloodLevel > 0 && this.bloodLevel <= 9) {
			this.healthLevel = 0;
		} else if (this.bloodLevel >= 10 && this.bloodLevel <= 19) {
			this.healthLevel = 5;
		} else if (this.bloodLevel >= 20 && this.bloodLevel <= 29) {
			this.healthLevel = 10;
		} else if (this.bloodLevel >= 30 && this.bloodLevel <= 39) {
			this.healthLevel = 15;
		} else if (this.bloodLevel >= 40 && this.bloodLevel <= 49) {
			this.healthLevel = 20;
		}
		return healthLevel;
	}


	@Override
	public void bite() {
		this.bloodLevel -= 9;
		
	}


}
