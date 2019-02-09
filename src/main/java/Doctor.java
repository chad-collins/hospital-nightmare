
public class Doctor extends Employee implements HasVitals, HasMedicalTraining {

	private String specialty;
	
	public Doctor(String empID, String empName, boolean isAvailable, String specialty) {
		
		super(empID, empName, isAvailable);
		
		this.specialty = specialty;
	
	}

	public String getSpecialty() {
		return specialty;
	}


	public void busy() {
	super.busy();
	
	}

	@Override
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
