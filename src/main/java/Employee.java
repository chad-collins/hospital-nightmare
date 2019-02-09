
public abstract class Employee {

	private int empID;
	private String empName;
	private boolean isAvailable;
	private int salary;

	public Employee(int empID, String empName, boolean isAvailable) {

		this.empID = empID;
		this.empName = empName;
		this.isAvailable = isAvailable;
		this.salary = salary;
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
	
	public int getSalary() {
		return this.salary;
	}
	
	public void notBusy() {
		isAvailable = true;

	}

	public void busy() {
		isAvailable = false;

	}

}
