import java.util.HashMap;
import java.util.Random;

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
		//trying to figure out how to take the removed staff and add to patient collection
		Patient newPatient = new Patient(toRemove.getEmpID(), toRemove.getEmpName(), "[Psych Ward]");
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
					System.out.println("[Psych " + employee.getEmpName() + " is not available]");
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
					System.out.println("[Pain management " + employee.getEmpName() + " is not available]");
				}
			}
		}
		}
	}

	public void allAvailDoctors() {
		for (Employee employee : employees.values()) {
			if ((employee instanceof Doctor) && !(employee instanceof Surgeon)){
				if (employee.getIsAvailable() == true) {

					employee.statusSummary();
				} else {
					System.out.println("[" + employee.getEmpName() + " is not available]");
				}
			}
		}
	}
	public void allAvailSurgeons() {
		for (Employee employee : employees.values()) {
			if (employee instanceof Surgeon) {
				if (employee.getIsAvailable() == true) {

					employee.statusSummary();
				} else {
					System.out.println("[" + employee.getEmpName() + " is not available]");
				}
					
				}
			}
		}
	
//	public void checkStaffAvailability() {
//		for (Employee employee : employees.values()) {
//			if (employee instanceof Surgeon) || (employee instanceof Nurse) || (employee instanceof Doctor) {
//				if (employee.getIsAvailable() == true) {
//
//					employee.statusSummary();
//				} else {
//					System.out.println("[" + employee.getEmpName() + " is not available]");
//				}
//					
//				}
//			}
//		}
	
	public void empTickAll() {
		for (Employee employee : employees.values()) {
			if (employee.getIsAvailable() == false) {
				Random h = new Random();
				int maybeBusy = h.nextInt(3);
				if (maybeBusy == 1) 
					employee.notBusy();}
		}
	}
}

				
		

		


