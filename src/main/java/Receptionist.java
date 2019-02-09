
public class Receptionist extends Employee implements HasVitals{
	
	private int bloodLevel;
	private int healthLevel;
	
	public Receptionist(int empID, String empName, boolean isAvailable) {
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
	System.out.println(this.getEmpName() + "is on the phone.");
	}

	@Override
	public void bloodIsDrawn() {
		this.bloodLevel -= 5;
		
	}

	@Override
	public void receivesCare() {
		healthLevel += 10;
		
	}
	

}

