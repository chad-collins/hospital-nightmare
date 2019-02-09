
public class Receptionist extends Employee implements HasVitals{
	
	public Receptionist(String empID, String empName, boolean isAvailable) {
		super(empID, empName, isAvailable);
		
	}

	public void drawBlood() {
		//DELETE THIS AFTER HASVITALS INTERFACE IS FINISHED AND MERGED.

	}
	

	public void busy() {
	super.busy();
	System.out.println(this.getEmpName() + "is on the phone.");
	}
	

}

