
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
		return healthLevel;
	}

	@Override
	public void bloodIsDrawn() {
		this.bloodLevel -= 5;

	}

	@Override
	public void receivesCare() {
		this.healthLevel += 10;

	}
}
