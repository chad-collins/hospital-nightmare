import java.util.HashMap;


public class AllEmployees {

	
	private HashMap<String, Employee> employees = new HashMap<String, Employee>();
	
	
	public int getAllEmployeesLength() {
		return employees.size();
	}

	public void addEmployee(Employee toPut) {
		employees.put(toPut.getEmpID(), toPut);
	}

	public Employee getEmployee(String toGet) {
		return employees.get(toGet);
	}

	public void removeEmployee(Employee toRemove) {
		employees.remove(toRemove.getEmpID(), toRemove);;
	}
	

}
