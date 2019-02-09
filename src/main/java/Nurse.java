
public class Nurse extends Employee implements HasVitals{
	
	private int bloodLevel;
	private int healthLevel;
	private String specialty;
	private int salary;
	
	public Nurse(String empID, String empName, boolean isAvailable, String specialty) {
		super(empID, empName, isAvailable);
		this.specialty = specialty;
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
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

	public void busy() {
		super.busy();
		System.out.println(this.getEmpName() + " is nursing patients back to health.");
		
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
