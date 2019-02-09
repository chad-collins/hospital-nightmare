
public class Surgeon extends Doctor implements HasVitals, HasMedicalTraining {

	private int bloodLevel;
	private int healthLevel;

	public Surgeon(String empID, String empName, boolean isAvailable, String specialty) {

		super(empID, empName, isAvailable, specialty);

		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;

	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void busy() {
		super.busy();
		System.out.println(this.getEmpName() + " is in surgery.");

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
