
public class Surgeon extends Doctor implements HasVitals, HasMedicalTraining {

	private int bloodLevel;
	private int healthLevel;
	private int salary;

	public Surgeon(String empID, String empName, boolean isAvailable, String specialty) {

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

	}

	@Override
	public void bloodIsDrawn() {
		this.bloodLevel -= 5;

	}

	@Override
	public void receivesCare() {
		this.healthLevel += 10;

	}
	
	public void busyStatus() {
		if (!getIsAvailable()) {
			System.out.println("IN SURGERY");
		} else {
			System.out.println("Surgeon " + this.getEmpName() + " is available.");
		}
	}

}
