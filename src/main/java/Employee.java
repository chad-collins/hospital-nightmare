
public abstract class Employee {

	private int empID;
	private String empName;
	private boolean isAvailable;

	public Employee(int empID, String empName, boolean isAvailable) {

		this.empID = empID;
		this.empName = empName;
		this.isAvailable = isAvailable;
	}

	public int getEmpID() {

		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public boolean getIsAvailable() {

		return isAvailable;
	}

	public void notBusy() {
		isAvailable = true;

	}

	public void busy() {
		isAvailable = false;

	}

}
