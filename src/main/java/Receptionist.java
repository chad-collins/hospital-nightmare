
public class Receptionist extends Employee implements HasVitals{
	
	private int bloodLevel;
	private int healthLevel;
	private String empTitle;
	private int salary;
	private int callSkill;

	public Receptionist(String empID, String empName, boolean isAvailable, int callSkill) {

	

		super(empID, empName, isAvailable);
		
		this.bloodLevel = BLOOD_LEVEL + 20;
		this.healthLevel = HEALTH_LEVEL;
		this.empTitle = "Receptionist";
		this.salary = 45000;
		this.callSkill = callSkill;
	}
	
	public String getEmpTitle() {
		return empTitle;
	}
	public int getSalary() {
		return salary;
	}
	public int getCallSkill() {
		return callSkill;
	}
	
	@Override
	public int calculatePay() {
		return salary;
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

	public void busy() {
	super.busy();
	}

	
	public String busyStatus() {
		if (!getIsAvailable()) {
			return "ON THE PHONE";
		} else {
			return "AVAILABLE";
		}
	}

	@Override
	public void isBitten() {
		this.bloodLevel -= 10;
		
	}
	

}

