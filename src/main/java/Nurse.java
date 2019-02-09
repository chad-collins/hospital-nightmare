
public class Nurse extends Employee implements HasVitals{
	
	private int bloodLevel;
	private int healthLevel;
	private String specialty;
	private String empTitle;
	private int salary;
	
	public Nurse(String empID, String empName, boolean isAvailable, String specialty) {
		super(empID, empName, isAvailable);
		this.specialty = specialty;
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
		this.empTitle = "Nurse  ";
		this.salary = 50;
	}
	
	public int getBloodLevel() {
		return this.bloodLevel;
	}
	
	public int getHealthLevel() {
		return this.healthLevel;
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
			return "WITH A PATIENT";
		} else {
			return "AVAILABLE";
		}
	}

}
