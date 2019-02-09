
public class VampireJanitor extends Janitor {

	public VampireJanitor(String empID, String empName, boolean isAvailable) {
		super(empID, empName, isAvailable);

	}

	public void busy() {
		super.busy();
	}

	@Override
	public void busyStatus() {
		if (!getIsAvailable()) {
			System.out.println("DRINKING BL.. UH.. SWEEPING");
		} else {
			System.out.println("Janitor " + this.getEmpName() + " is available.");
		}
	}

}
