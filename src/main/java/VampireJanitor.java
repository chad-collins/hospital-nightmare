
public class VampireJanitor extends Janitor {
	private String empTitle;
	private int salary;
	public VampireJanitor(String empID, String empName, boolean isAvailable) {
		super(empID, empName, isAvailable);
		this.empTitle = "Janitor";
		this.salary = 40000;
	}

	public String getEmpTitle() {
		return empTitle;
	}
	public int getSalary() {
		return salary;
	}
	
	
	
	public void busy() {
		super.busy();
	}

	@Override
	public String busyStatus() {
		if (!getIsAvailable()) {
			return "drinking blo..uh..SWEEPING";
		} else {
			return "AVAILABLE";
		}
	}

}
