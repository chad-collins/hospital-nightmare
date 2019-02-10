
public class Doctor extends Employee implements HasVitals, HasMedicalTraining {

	private String specialty;
	private int bloodLevel;
	private int healthLevel;
	private String empTitle;
	public int salary;
	public Doctor(String empID, String empName, boolean isAvailable, String specialty) {

		super(empID,empName, isAvailable);
		this.specialty = specialty;
		this.bloodLevel = BLOOD_LEVEL + 20;
		this.healthLevel = HEALTH_LEVEL;
		this.empTitle = "Doctor ";
		this.salary = 90;
	}

	public String getSpecialty() {
		return specialty;
	}

	public int getBloodLevel() {
		return this.bloodLevel;
	}

	public int getHealthLevel() {
		if (this.bloodLevel <= 0) {
			this.healthLevel = 0;
		} else if (this.bloodLevel > 0 && this.bloodLevel <= 19) {
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

	public void busy() {
		super.busy();

	}

	
	public String getEmpTitle() {
		return empTitle;
	}

	public int getSalary() {
		return salary;
	}
	
	@ Override
	public void medicatePatient(Patient patient) {
		patient.medicatePatient(10);
		return;
	}

	public String busyStatus() {
		if (!getIsAvailable()) {
			return "WITH A PATIENT";
		} else {
			return "AVAILABLE";
		}
	}

	@Override
	public void infuse(Patient patient) {
		patient.receiveInfusion(30);
		return;
		
	}

	@Override
	public void bite() {
		this.bloodLevel -= 9;
		
	}
}
