
public class Surgeon extends Doctor implements HasVitals, HasMedicalTraining {

	private int bloodLevel;
	private int healthLevel;
	private String empTitle;
	private int salary;

	public Surgeon(String empID, String empName, boolean isAvailable, String specialty) {

		super(empID, empName, isAvailable, specialty);

		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
		this.empTitle = "Surgeon";
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

	public String getEmpTitle() {
		return empTitle;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public void bloodIsDrawn() {
		this.bloodLevel -= 5;

	}

	@Override
	public void receivesCare() {
		this.healthLevel += 10;

	}

	public String busyStatus() {
		if (!getIsAvailable()) {
			return "IN SURGERY";
		} else {
			return "AVAILABLE";
		}
	}
	
	@Override
	public int infuse() {
		return 100;
		
	}
	
	@Override
	public int medicatePatient() {
		return 75;

	}

}
