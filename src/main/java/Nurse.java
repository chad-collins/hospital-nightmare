
public class Nurse extends Employee implements HasVitals{
	
	private int bloodLevel;
	private int healthLevel;
	private int salary;

	public Nurse(String empID, String empName, boolean isAvailable) {
		super(empID, empName, isAvailable);
	
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
			System.out.println("WITH A PATIENT");
		} else {
			System.out.println("Nurse " + this.getEmpName() + " is available.");
		}
	}

}
