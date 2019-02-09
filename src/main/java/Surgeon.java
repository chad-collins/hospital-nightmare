
public class Surgeon extends Doctor implements HasVitals, HasMedicalTraining {

	
	public Surgeon(int empID, String empName, boolean isAvailable, String specialty) {
		
		super(empID, empName, isAvailable, specialty);
		

	
	}



	public void busy() {
	super.busy();
	
	}


}

