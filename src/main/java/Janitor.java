
public class Janitor extends Employee implements HasVitals{

	public Janitor(int empID, String empName, boolean isAvailable) {
		super(empID, empName, isAvailable);
		
	}

	

	public void busy() {
	super.busy();
	System.out.println(this.getEmpName() + " is sweeping.");
	}
	

}
