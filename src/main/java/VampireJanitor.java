
public class VampireJanitor extends Janitor {

	public VampireJanitor(String empID, String empName, boolean isAvailable) {
		super(empID, empName, isAvailable);

	}
	
	

	public void busy() {
	super.busy();
	System.out.println(this.getEmpName() + " is sweeping.");
	}
	

}
