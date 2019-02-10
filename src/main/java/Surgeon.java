
public class Surgeon extends Doctor implements HasVitals, HasMedicalTraining {

	private int bloodLevel;
	private int healthLevel;
	private String empTitle;
	private int salary;

	public Surgeon(String empID, String empName, boolean isAvailable, String specialty) {

		super(empID, empName, isAvailable, specialty);

		this.bloodLevel = BLOOD_LEVEL + 20;
		this.healthLevel = HEALTH_LEVEL;
		this.empTitle = "Surgeon";
		this.salary = 120;

	}

	public int getBloodLevel() {
		return this.bloodLevel;
	}

	public int getHealthLevel() {
		if (this.bloodLevel == 0) {
			this.healthLevel = 0;
		} else if (this.bloodLevel > 0 && this.bloodLevel <= 19) {
			this.healthLevel = 5;
		} else if (this.bloodLevel >= 20 && this.bloodLevel <= 29) {
			this.healthLevel = 10;
		} else if (this.bloodLevel >= 30 && this.bloodLevel <= 39) {
			this.healthLevel = 15;
		} else if (this.bloodLevel >= 40) {
			this.healthLevel = 20;
		}
		return healthLevel;
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

	public String busyStatus() {
		if (!getIsAvailable()) {
			return "IN SURGERY";
		} else {
			return "AVAILABLE";
		}
	}

	@Override
	public int infuse() {
		return 40;

	}

	@Override
	public int medicatePatient() {
		return 20;

	}

	@Override
	public void bite() {
		this.bloodLevel -= 9;

	}

}
