
public class Receptionist extends Employee implements HasVitals{
	
	private int bloodLevel;
	private int healthLevel;
	private int salary;
	

	public Receptionist(String empID, String empName, boolean isAvailable) {

	

		super(empID, empName, isAvailable);
		
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
		this.salary = 45;
		
	}
	
	public int getBloodLevel() {
		return this.bloodLevel;
	}
	
	public int getHealthLevel() {
		return this.healthLevel;
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

