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
		employees.remove(toRemove.getEmpID(), toRemove);

	}

	public void allempStatusSummary() {
		for (Employee employee : employees.values()) {

			employee.statusSummary();
		}
	}

	public void allAvailMedical() {
		allAvailPsychNurses();
		allAvailPainMgmtNurses();
		allAvailDoctors();
		allAvailSurgeons();
	}

	public void allAvailPsychNurses() {
		for (Employee employee : employees.values()) {
			if (employee instanceof Nurse) {
				if (employee.getSpecialty().contentEquals("[Psych Ward]")) {
					if (employee.getIsAvailable() == true) {
						employee.statusSummary();
					} else {
					System.out.println("[Psych nurse " + employee.getEmpName() + " is not available]");
				}
			}
		}
		}
	}
	
	public void allAvailPainMgmtNurses() {
		for (Employee employee : employees.values()) {
			if (employee instanceof Nurse) {
				if (employee.getSpecialty().contentEquals("[Pain management]")) {
					if (employee.getIsAvailable() == true) {
						employee.statusSummary();
					} else {
					System.out.println("[Pain management nurse " + employee.getEmpName() + " is not available]");
				}
			}
		}
		}
	}

	public void allAvailDoctors() {
		for (Employee doctor : employees.values()) {
			if ((doctor instanceof Doctor) && !(doctor instanceof Surgeon)){
				if (doctor.getIsAvailable() == true) {

					doctor.statusSummary();
				} else {
					System.out.println("[No Doctors available]");
				}
			}
		}
	}
	public void allAvailSurgeons() {
		for (Employee surgeon : employees.values()) {
			if (surgeon instanceof Surgeon) {
				if (surgeon.getIsAvailable() == true) {

					surgeon.statusSummary();
				} 
					
				
			}
		}
	}
}
