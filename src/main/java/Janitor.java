
public class Janitor extends Employee implements HasVitals{
	
	private int bloodLevel;
	private int healthLevel;
	private int salary;

	public Janitor(String empID, String empName, boolean isAvailable) {
		super(empID, empName, isAvailable);
		
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
		this.salary = 40;
		
	}
	
	public int getBloodLevel() {
		return this.bloodLevel;
	}
	
	public int getHealthLevel() {
		return this.healthLevel;
	}


	public void busy() {
	super.busy();
	System.out.println(this.getEmpName() + " is sweeping.");
	}

	@Override
	public void bloodIsDrawn() {
		bloodLevel -= 5;
		
	}


	@Override
	public void receivesCare() {
		this.healthLevel += 10;		
	}
	

}
