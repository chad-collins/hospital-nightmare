
public class Surgeon extends Doctor implements HasVitals, HasMedicalTraining {

	private int bloodLevel;
	private int healthLevel;
	private int salary;

	public Surgeon(int empID, String empName, boolean isAvailable, String specialty) {

		super(empID, empName, isAvailable, specialty);

		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
		this.salary = 120;

	}

	public int getBloodLevel() {
		return this.bloodLevel;
	}

	public int getHealthLevel() {
		return this.healthLevel;
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
