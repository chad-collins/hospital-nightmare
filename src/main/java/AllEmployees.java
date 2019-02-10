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
	
	public void remove(String toGet) {
		employees.remove(toGet);
	}

//	public void removeDeadEmployees() {
//		for (Employee employee : employees.values()) {
//			if (employee instanceof Janitor) {
//				if (((Janitor) employee).getHealthLevel() == 0) {
//					String employeeToRemove = ((Janitor) employee).getEmpID();
//					String employeeToRemoveName = ((Janitor) employee).getEmpName();
//					employees.remove(employeeToRemove);
//					System.out.println("Janitor " + employeeToRemoveName + " has passed away.");
//				}
//			} else if (employee instanceof Receptionist) {
//				if (((Receptionist) employee).getHealthLevel() == 0) {
//					String employeeToRemove = ((Receptionist) employee).getEmpID();
//					String employeeToRemoveName = ((Receptionist) employee).getEmpName();
//					employees.remove(employeeToRemove);
//					System.out.println("Receptionist " + employeeToRemoveName + " has passed away.");
//				}
//			} else if (employee instanceof Nurse) {
//				if (((Nurse) employee).getHealthLevel() == 0) {
//					String employeeToRemove = ((Nurse) employee).getEmpID();
//					String employeeToRemoveName = ((Nurse) employee).getEmpName();
//					employees.remove(employeeToRemove);
//					System.out.println(employeeToRemoveName + " has passed away.");
//				}
//			} else if (employee instanceof Doctor) {
//				if (((Doctor) employee).getHealthLevel() == 0) {
//					String employeeToRemove = ((Doctor) employee).getEmpID();
//					String employeeToRemoveName = ((Doctor) employee).getEmpName();
//					employees.remove(employeeToRemove);
//					System.out.println(employeeToRemoveName + " has passed away.");
//				}
//			} else if (employee instanceof Surgeon) {
//				if (((Surgeon) employee).getHealthLevel() == 0) {
//					String employeeToRemove = ((Surgeon) employee).getEmpID();
//					String employeeToRemoveName = ((Surgeon) employee).getEmpName();
//					employees.remove(employeeToRemove);
//					System.out.println("Surgeon " + employeeToRemoveName + " has passed away.");
//				}
//			} else {
//			}
//		}
//	}

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
			if ((employee instanceof Doctor) && !(employee instanceof Surgeon)) {
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

	public int checkStaffAvailability() {
		int availableMedicalStaff = checkDoctorAvailability() + checkNurseAvailability();
		return availableMedicalStaff;
	}
	
	public int checkJanitorAvailability() {
		int sum = 0;
		int x = 0;
		for (Employee janitor : employees.values()) {
			if (janitor instanceof Janitor) {
				if (janitor.getIsAvailable() == true) {
					x++;
					sum = x;
				}
			}
		}return sum;
	}

	public int checkDoctorAvailability() {
		int sum = 0;
		int x = 0;
		for (Employee employee : employees.values()) {
			if (employee instanceof Doctor) {
				if (employee.getIsAvailable() == true) {
					x++;
					sum = x;
				}
			}
		}
		return sum;
	}
	
	public int checkSurgeonAvailability() {
		int sum = 0;
		int x = 0;
		for (Employee employee : employees.values()) {
			if (employee instanceof Surgeon) {
				if (employee.getIsAvailable() == true) {
					x++;
					sum = x;
				}
			}
		}
		return sum;
	}

	public int checkNurseAvailability() {
		int sum = 0;
		int x = 0;
		for (Employee employee : employees.values()) {
			if (employee instanceof Nurse) {
				if (employee.getIsAvailable() == true) {
					x++;
					sum = x;
				}
			}
		}
		return sum;
	}

	/*
	 * public void empTickAll() { for (Employee employee : employees.values()) { if
	 * (employee.getIsAvailable() == false) { Random h = new Random(); int maybeBusy
	 * = h.nextInt(3); if (maybeBusy == 1) employee.notBusy(); } } }
	 */
	
	public void empTickAll() {
		tickJanitorsAll();
		tickNursesAll();
		tickDoctorsAll();
		tickReceptionistsAll();
	}
	public void tickJanitorsAll() {
		for (Employee j : employees.values()) {
			if(j instanceof Janitor)
			if (j.getIsAvailable() == false) {
				Random h = new Random();
				int maybeBusy = h.nextInt(3);
				if (maybeBusy == 1)
					j.notBusy();
			}
		}
	}
	public void tickNursesAll() {
		for (Employee n : employees.values()) {
			if(n instanceof Nurse)
			if (n.getIsAvailable() == false) {
				Random h = new Random();
				int maybeBusy = h.nextInt(5);
				if (maybeBusy == 4)
					n.notBusy();
			}
		}
	}
	public void tickDoctorsAll() {
		for (Employee d : employees.values()) {
			if(d instanceof Doctor)
			if (d.getIsAvailable() == false) {
				Random h = new Random();
				int maybeBusy = h.nextInt(4);
				if (maybeBusy == 3)
					d.notBusy();
			}
		}
	}
	public void tickReceptionistsAll() {
		for (Employee r : employees.values()) {
			if(r instanceof Janitor)
			if (r.getIsAvailable() == false) {
				Random h = new Random();
				int maybeBusy = h.nextInt(4);
				if (maybeBusy == 3)
					r.notBusy();
			}
		}
	}
}
