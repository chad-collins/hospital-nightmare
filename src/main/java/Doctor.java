
public class Doctor extends Employee implements HasVitals, HasMedicalTraining {

	private String specialty;
	private int bloodLevel;
	private int healthLevel;
	private String empTitle;
	public int salary;
	public Doctor(String empID, String empName, boolean isAvailable, String specialty) {

		super(empID,empName, isAvailable);
		this.specialty = specialty;
		this.bloodLevel = BLOOD_LEVEL;
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

	public void drawBlood() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sedatePatient() {
		// TODO Auto-generated method stub

	}

	@Override
	public void medicatePatient() {
		// TODO Auto-generated method stub

	}

	public String busyStatus() {
		if (!getIsAvailable()) {
			return "WITH A PATIENT";
		} else {
			return "AVAILABLE";
		}
	}

}
