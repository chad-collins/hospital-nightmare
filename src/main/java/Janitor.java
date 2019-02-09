
public class Janitor extends Employee implements HasVitals{
	
	private int bloodLevel;
	private int healthLevel;
	private int salary;
	private String empTitle;
	public Janitor(String empID, String empName, boolean isAvailable) {
		super(empID, empName, isAvailable);
		this.empTitle = "Janitor";
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
		this.salary = 40;
		this.empTitle = "Janitor";
		
	}
	
	public int getBloodLevel() {
		return this.bloodLevel;
	}
	
	public int getHealthLevel() {
		return this.healthLevel;
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
		bloodLevel -= 5;		
	}

	@Override
	public void receivesCare() {
		this.healthLevel += 10;		
	}
	
	public String busyStatus() {
		if (!getIsAvailable()) {
			return "SWEEPING";
		} else {
			return "AVAILABLE";
		}
	}
	

}
