
public abstract class Employee {

	// CLASS ABSTRACTED. TESTS FAIL
	private String empID;
	private String empName;
	private boolean isAvailable;
	private int salary;

	public Employee(String empID, String empName, boolean isAvailable) {

		this.empID = empID;
		this.empName = empName;
		this.isAvailable = isAvailable;
		this.salary = salary;
	}

	public String getEmpID() {

		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public int getSalary() {
		return this.salary;
	}

	public void notBusy() {
		isAvailable = true;

	}

	public void busy() {
		isAvailable = false;

	}
	
	public void busyStatus() {
		return;
	}

}
