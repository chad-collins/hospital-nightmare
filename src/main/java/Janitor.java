
public class Janitor extends Employee implements HasVitals{
	
	private int bloodLevel;
	private int healthLevel;

	public Janitor(String empID, String empName, boolean isAvailable) {
		super(empID, empName, isAvailable);
		
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
		
	}
	
	public int getBloodLevel() {
		return bloodLevel;
	}
	
	public int getHealthLevel() {
		return healthLevel;
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
