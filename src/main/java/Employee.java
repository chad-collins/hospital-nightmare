
public abstract class Employee {

	private String empID;
	private String empName;
	private String empTitle;
	private boolean isAvailable;
	private int salary;

	public Employee(String empID, String empName, boolean isAvailable) {

		this.empID = empID;
		this.empName = empName;
		this.isAvailable = isAvailable;
	}

	public String getEmpID() {

		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpTitle() {
		return empTitle;
	}

	public String getSpecialty() {
		return "";
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public int getSalary() {
		return salary;
	}

	public void notBusy() {
		isAvailable = true;

	}

	public void busy() {
		isAvailable = false;

	}
	
	
	public void empTick() {
		tickBusy();
	}
	
	public void tickBusy(){
		if (!this.isAvailable){
			for(int x = 0; x<=3; x++){
				int turn = 0;
				turn += turn + x;
				if (turn == 3) {
					this.isAvailable = true;
				}
			}
		}
		
	}

	public void statusSummary() {
		System.out.println(
				"[ID:" + this.getEmpID() 
				+ "]\t[" + this.getEmpName() 
				+ "]\t[" + this.getEmpTitle() 
				+ "]\t[CURRENTLY: " + this.busyStatus() 
				+ "]\t[Salary: $" + this.getSalary() 
				+ "]\t" + this.getSpecialty());

	}

	
	public String busyStatus() {
		
		return "";
	}
}
