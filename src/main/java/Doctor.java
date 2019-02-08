
public class Doctor extends Employee {

	private String specialty;
	
	public Doctor(int empID, String empName, boolean isAvailable, String specialty) {
		
		super(empID, empName, isAvailable);
		
		this.specialty = specialty;
	
	}

	public String getSpecialty() {
		return specialty;
	}


	public String busy() {
	super.busy();
	return this.getEmpName() + " is treating a patient";
	}
}
