
public class Receptionist extends Employee implements HasVitals{
	
	private int bloodLevel;
	private int healthLevel;
	private String empTitle;
	private int salary;

	public Receptionist(String empID, String empName, boolean isAvailable) {

	

		super(empID, empName, isAvailable);
		
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
		this.empTitle = "Receptionist";
		this.salary =45;
		
	}
	
	public String getEmpTitle() {
		return empTitle;
	}
	public int getSalary() {
		return salary;
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
		healthLevel += 10;
		
	}
	
	public String busyStatus() {
		if (!getIsAvailable()) {
			return "ON THE PHONE";
		} else {
			return "AVAILABLE";
		}
	}
	

}

