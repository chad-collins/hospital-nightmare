
public class VampireJanitor extends Janitor {
	private String empTitle;
	private int salary;
	public VampireJanitor(String empID, String empName, boolean isAvailable, int sweepSkill) {
		super(empID, empName, isAvailable, sweepSkill);
		this.empTitle = "Janitor";
		this.salary =10;
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
