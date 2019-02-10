
public class Nurse extends Employee implements HasVitals, HasMedicalTraining{
	
	private int bloodLevel;
	private int healthLevel;
	private String specialty;
	private String empTitle;
	private int salary;
	private boolean isAvailable;
	
	public Nurse(String empID, String empName, boolean isAvailable, String specialty) {
		super(empID, empName, isAvailable);
		this.empTitle = "Nurse";
		this.specialty = specialty;
		this.bloodLevel = BLOOD_LEVEL + 20;
		this.healthLevel = HEALTH_LEVEL;
		this.empTitle = "Nurse  ";
		this.salary = 50000;
		this.isAvailable = isAvailable;
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
	
	@Override
	public int calculatePay() {
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
	public void infuse(Patient patient) {
		patient.receiveInfusion(0);
		System.out.println("Nurses aren't trained in infusion!");
		return;
		
	}
	
	@ Override
	public void medicatePatient(Patient patient) {
		patient.medicatePatient(5);
		return;
	}

	@Override
	public void bite() {
		this.bloodLevel -= 9;
		
	}
	

		
		
	

}
