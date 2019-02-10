
public class Nurse extends Employee implements HasVitals, HasMedicalTraining{
	
	private int bloodLevel;
	private int healthLevel;
	private String specialty;
	private String empTitle;
	private int salary;
	
	public Nurse(String empID, String empName, boolean isAvailable, String specialty) {
		super(empID, empName, isAvailable);
		this.specialty = specialty;
		this.bloodLevel = BLOOD_LEVEL + 20;
		this.healthLevel = HEALTH_LEVEL;
		this.empTitle = "Nurse  ";
		this.salary = 50;
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
		} else if (this.bloodLevel >= 40 && this.bloodLevel <= 49) {
			this.healthLevel = 20;
		}
		return healthLevel;
	}
	
	public String getSpecialty() {
		return specialty;
		
	}
	public String getEmpTitle() {
		return empTitle;
	}
	public int getSalary() {
		return salary;
	}

	public void busy() {
		super.busy();
	}

	
	public String busyStatus() {
		if (!getIsAvailable()) {
			return "WITH A PATIENT";
		} else {
			return "AVAILABLE";
		}
	}

	@Override
	public int infuse() {
		System.out.println("Nurses aren't trained on infusion!");
		return 0;
	}
	
	@Override
	public int medicatePatient() {
		return 10;
		
	}

	@Override
	public void bite() {
		this.bloodLevel -= 9;
		
	}
	

		
		
	

}
