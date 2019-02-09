
public class Doctor extends Employee implements HasVitals, HasMedicalTraining {


	private String specialty;
	private int bloodLevel;
	private int healthLevel;

	
	public Doctor(String empID, String empName, boolean isAvailable, String specialty) {


		super(empID, empName, isAvailable);

		this.specialty = specialty;
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;

	}

	public String getSpecialty() {
		return specialty;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void busy() {
		super.busy();
		System.out.println(this.getEmpName() + " is seeing patients.");

	}

	@Override
	public void bloodIsDrawn() {
		this.bloodLevel -= 5;

	}

	@Override
	public void receivesCare() {
		this.healthLevel += 10;

	}


	public void drawBlood() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sedatePatient() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void medicatePatient() {
		// TODO Auto-generated method stub
		
	}

}
