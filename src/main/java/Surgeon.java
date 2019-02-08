
public class Surgeon extends Doctor implements HasVitals {

	
	public Surgeon(int empID, String empName, boolean isAvailable, String specialty) {
		
		super(empID, empName, isAvailable, specialty);
		

	
	}



	public void busy() {
	super.busy();
	
	}

	@Override
	public void drawBlood() {
		//DELETE WHEN HASVITALS IS FINISHED
		
	}
}

